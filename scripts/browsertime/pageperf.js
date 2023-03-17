function inIframe () { try { return window.self !== window.top; } catch (e) { return true; } }

// Change summary for BrowserTime APACHE items from this folder:
// Scripts from: https://github.com/sitespeedio/browsertime/tree/main/browserscripts
// were consolidated here for a JSON summary payload with core vitals data.
// https://web.dev/vitals/

function cumulativeLayoutShift() {
    let supported = PerformanceObserver.supportedEntryTypes;
    if (!supported || supported.indexOf('layout-shift') === -1) {
        return;
    }
    // See https://web.dev/layout-instability-api
    // https://github.com/mmocny/web-vitals/wiki/Snippets-for-LSN-using-PerformanceObserver#max-session-gap1s-limit5s
    let max = 0;
    let curr = 0;
    let firstTs = Number.NEGATIVE_INFINITY;
    let  prevTs = Number.NEGATIVE_INFINITY;
    let observer = new PerformanceObserver(list => {});
    observer.observe({ type: 'layout-shift', buffered: true });
    let list = observer.takeRecords();
    for (let entry of list) {
        if (entry.hadRecentInput) {
            continue;
        }
        if (entry.startTime - firstTs > 5000 || entry.startTime - prevTs > 1000) {
            firstTs = entry.startTime;
            curr = 0;
        }
        prevTs = entry.startTime;
        curr += entry.value;
        max = Math.max(max, curr);
    }
    return max;
}

function observeAndReportFirstInputDelay() {
// note, may need updating for iframes, can use code here:  https://github.com/GoogleChrome/web-vitals
    const supported = PerformanceObserver.supportedEntryTypes;
    if (!supported || supported.indexOf("first-input") === -1) {
        return
    }
    new PerformanceObserver((entryList) => {
        for (const entry of entryList.getEntries()) {
            console.log('Observin')
            const delay = Number((entry.processingStart - entry.startTime).toFixed(1));

            var paint = {};
            performance.getEntriesByType('paint').forEach(function(element) { paint[element.name] = element.startTime});

            let _firstContentfulPaint = paint["first-contentful-paint"];
            page_timings = {
                "_firstInputDelay": delay
            };
            console.log("--->" + page_timings);
            sendTimings(page_timings);
        }
    }).observe({type: 'first-input', buffered: true});
}

function largestContentfulPaint() {
    // https://gist.github.com/karlgroves/7544592
    function getDomPath(el) {
        let stack = [];
        while ( el.parentNode != null ) {
            let sibCount = 0;
            let sibIndex = 0;
            for ( let i = 0; i < el.parentNode.childNodes.length; i++ ) {
                let sib = el.parentNode.childNodes[i];
                if ( sib.nodeName == el.nodeName ) {
                    if ( sib === el ) {
                        sibIndex = sibCount;
                    }
                    sibCount++;
                }
            }
            if ( el.hasAttribute && el.hasAttribute('id') && el.id != '' ) {
                stack.unshift(el.nodeName.toLowerCase() + '#' + el.id);
            } else if ( sibCount > 1 ) {
                stack.unshift(el.nodeName.toLowerCase() + ':eq(' + sibIndex + ')');
            } else {
                stack.unshift(el.nodeName.toLowerCase());
            }
            el = el.parentNode;
        }

        return stack.slice(1);
    }

    let supported = PerformanceObserver.supportedEntryTypes;
    if (!supported || supported.indexOf('largest-contentful-paint') === -1) {
        return;
    }
    let observer = new PerformanceObserver(list => {});
    observer.observe({ type: 'largest-contentful-paint', buffered: true });
    let entries = observer.takeRecords();
    let candidates = [];
    for (let entry of entries) {
        let element = entry.element;
        candidates.push(
            {
                duration: entry.duration,
                id: entry.id,
                url: entry.url,
                loadTime: Number(entry.loadTime.toFixed(0)),
                renderTime: Number(Math.max(entry.renderTime,entry.loadTime).toFixed(0)),
                size: entry.size,
                startTime: Number(entry.startTime.toFixed(0)),
                tagName: element ? element.tagName : '',
                className: element ? element.className : '',
                domPath:  element ? (getDomPath(element)).join( ' > ') : '',
                tag: element ? (element.cloneNode(false)).outerHTML : ''
            }

        )
    }
    return candidates;
}

function navTimings() {
    let t = window.performance.getEntriesByType('navigation')[0];
    let d = 0;
    if (t) {
        return {
            domainLookupTime: Number(
                (t.domainLookupEnd - t.domainLookupStart).toFixed(d)
            ),
            ttfb: Math.round(t.responseStart - t.requestStart),
            redirectionTime: Number((t.redirectEnd - t.redirectStart).toFixed(d)),
            serverConnectionTime: Number((t.connectEnd - t.connectStart).toFixed(d)),
            serverResponseTime: Number((t.responseEnd - t.requestStart).toFixed(d)),
            pageDownloadTime: Number((t.responseEnd - t.responseStart).toFixed(d)),
            domInteractiveTime: Number(t.domInteractive.toFixed(d)),
            domContentLoadedTime: Number(t.domContentLoadedEventStart.toFixed(d)),
            pageLoadTime: Number(t.loadEventStart.toFixed(d)),
            frontEndTime: Number((t.loadEventStart - t.responseEnd).toFixed(d)),
            backEndTime: Number(t.responseStart.toFixed(d))
        };
    } else {
        // Safari
        t = window.performance.timing;
        return {
            domainLookupTime: t.domainLookupEnd - t.domainLookupStart,
            redirectionTime: t.fetchStart - t.navigationStart,
            serverConnectionTime: t.connectEnd - t.connectStart,
            serverResponseTime: t.responseEnd - t.requestStart,
            pageDownloadTime: t.responseEnd - t.responseStart,
            domInteractiveTime: t.domInteractive - t.navigationStart,
            domContentLoadedTime: t.domContentLoadedEventStart - t.navigationStart,
            pageLoadTime: t.loadEventStart - t.navigationStart,
            frontEndTime: t.loadEventStart - t.responseEnd,
            backEndTime: t.responseStart - t.navigationStart,
            ttfb: t.responseStart - t.requestStart
        };
    }
}

function firstPaint() {
    let p = window.performance,
        timing = p.timing,
        entries = p.getEntriesByType('paint');

    if (entries.length > 0) {
        for (let entry of entries) {
            if (entry.name === 'first-paint')
                return Number(entry.startTime.toFixed(0));
        }
    }
    if (timing.timeToNonBlankPaint) {
        return Number(
            (timing.timeToNonBlankPaint - timing.navigationStart).toFixed(0)
        );
    }
    return undefined;
}

function postPerf(){
    if (inIframe()) { return };
    var paint = {};
    performance.getEntriesByType('paint').forEach(function(element) { paint[element.name] = element.startTime});
    var perf = performance.getEntriesByType('navigation')[0];

    n = navTimings()

    // missing har fields
    let onContentLoad = n.domContentLoadedTime;
    let onLoad = n.pageLoadTime;

    let _ttfb = n.ttfb
    let _firstContentfulPaint = Math.round(paint["first-contentful-paint"]);
    let _domInteractive = n.domInteractiveTime;
    let _firstPaint = firstPaint();
    let _largestContentfulPaint = largestContentfulPaint();
    let _cumulativeLayoutShift = cumulativeLayoutShift();
    let _dns = Math.round(perf.domainLookupEnd - perf.domainLookupStart);
    let _ssl = Math.round(perf.requestStart - perf.secureConnectionStart);

    var page_timings = {
        "title": window.document.title,
        "onContentLoad": onContentLoad,
        "onLoad": onLoad,
        "_href": window.location.href,
        "_dns": _dns,
        "_ssl": _ssl,
        "_timeToFirstByte": _ttfb,
        "_cumulativeLayoutShift": _cumulativeLayoutShift,
        "_largestContentfulPaint": _largestContentfulPaint,
        "_firstPaint": _firstPaint,
        "_domInteractive": _domInteractive,
        "_firstContentfulPaint": _firstContentfulPaint
   }
   sendTimings(page_timings);
}

function proxyMgmtURL(){ window.bupURL }

function sendTimings(page_timings){
    let data = new FormData();
    Object.keys(page_timings).forEach(key => page_timings[key] === undefined ? delete page_timings[key] : {});
    console.log(page_timings);
    data.append("pageTimings", JSON.stringify(page_timings));
    if ('sendBeacon' in navigator) {
        console.log("----> Sendbeacon---")
        if (navigator.sendBeacon(proxyMgmtURL() + "/har/page_timings", data)) {}
        else { console.error("BrowserUpProxy sendbeacon page_timings error") }
    }
}

observeAndReportFirstInputDelay();
window.addEventListener('load', postPerf);

document.addEventListener('visibilitychange', function () {
    if (document.visibilityState === 'hidden') {
        console.log("----> Page change---")
        if ('sendBeacon' in navigator) {
            navigator.sendBeacon(proxyMgmtURL() + "/har/page?title=", {});
        }
    }
});