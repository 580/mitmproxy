package com.javatest;

import static org.junit.jupiter.api.Assertions.*;

import com.browserup.proxy.api.BrowserUpProxyApi;
import com.browserup.proxy_client.ApiException;
import com.browserup.proxy_client.Entry;
import com.browserup.proxy_client.Har;
import com.browserup.proxy_client.WebSocketMessage;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Collections;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class JavaClientTestTest {
  private static final Integer PROXY_PORT = 8080;

  @BeforeEach
  void setUp() throws ApiException {
    // TODO reset fails on mitmproxy side
    // new BrowserUpProxyApi().resetHarLog();
  }

  @Test
  void testSendRequestAndGetHar() {
    var har = sendRequestAndGetHar("https://google.com");

    assertNotNull(har, "Expected HAR to be not null");
    assertNotNull(har.getLog(), "Expected HAR Log to be not null");
    assertTrue(har.getLog().getEntries().size() > 0, "Expected to get some HAR entries, found 0");
    assertTrue(
        har.getLog().getEntries()
            .stream()
            .anyMatch(e -> e.getRequest().getUrl().toString().contains("google")),
        "Expected to find HAR Entry with url containing 'google'");
  }

  @Test
  void testWebsocketSendMsgAndGetHar() {
    var har = sendRequestAndGetHar("https://websocketstest.com/", 5000);

    assertNotNull(har, "Expected HAR to be not null");
    assertNotNull(har.getLog(), "Expected HAR Log to be not null");
    assertTrue(har.getLog().getEntries().size() > 0, "Expected to get some HAR entries, found 0");

    var websocketEntries = har.getLog().getEntries().stream()
        .filter(entry -> {
          var webSocketMsgs = entry.getWebSocketMessages();
          return webSocketMsgs != null && webSocketMsgs.size() > 0;
        })
        .collect(Collectors.toList());

    assertTrue(websocketEntries.size() > 0,
        "Expected to find Har Entries with existing websocket messages");
    for (Entry websocketEntry : websocketEntries) {
      assertNotNull(websocketEntry.getWebSocketMessages(), "Expected websocket messages to be not null");
      for (WebSocketMessage webSocketMessage : websocketEntry.getWebSocketMessages()) {
        assertNotNull(webSocketMessage.getTime());
        assertNotNull(webSocketMessage.getData());
        assertNotNull(webSocketMessage.getOpcode());
        assertNotNull(webSocketMessage.getType());
      }
    }
  }

  private Har sendRequestAndGetHar(String url) {
    return sendRequestAndGetHar(url, 0);
  }

  private Har sendRequestAndGetHar(String url, int delayMs) {
    var driver = initDriver();

    driver.get(url);

    try {
      Thread.sleep(delayMs);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    Har result;
    try {
      result = getHar();
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    } finally {
      driver.quit();
    }
    return result;
  }

  private Har getHar() {
    Har harLog;
    try {
      harLog = new BrowserUpProxyApi().getHarLog();
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }
    return harLog;
  }

  @NotNull
  private ChromeDriver initDriver() {
    WebDriverManager.chromedriver().setup();

    var options = new ChromeOptions().addArguments(
        "--headless",
        "--disable-extensions",
        "--proxy-server=http://localhost:" + PROXY_PORT);

    return new ChromeDriver(options);
  }
}
