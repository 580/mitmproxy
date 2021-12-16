# The BrowserUp MITM Proxy

The BrowserUp MITM Proxy allows you to capture HTTP requests, and responses and content, 
and export performance data as a HAR file. 

The BrowserUp MITM Proxy is a fork of the amazing [mitmproxy](https://mitmproxy.org/), 
with an added performance testing, QA and DevOps flavor. 

Along with the standard mitmproxy features, the BrowserUp MITM Proxy offers adds a REST control API and native language clients in 
Java, JavaScript, Python and Ruby. It allows HAR capture (websockets and HTTP/2 too), and provides the ability to 
verify (assert) about network traffic.

BrowserUp MITM Proxy is especially useful when used with Selenium or Cypress tests.

The REST API is documented [here](./doc.html) 

Getting started:

Clone our fork:

`git clone https://github.com/browserup/mitmproxy.git`

Follow the mitmproxy [certificate setup instructions](https://docs.mitmproxy.org/stable/concepts-certificates/)

Run one of our [examples in clients/examples](clients/examples)

The standard mitmproxy executables are also shipped, and should work as normal.

BrowserUp is a code contributor to the upstream project, and we hope to continue to support them with 
code contributions where possible.

Our fork for HAR, and clients are in the browserup addons.s

mitmproxy/tree/main/mitmproxy/addons/browserup/
mitmproxy/tree/main/test/mitmproxy/addons/browserup

The standard MITMProxy documentation follows below.

----------------


# mitmproxy

[![Continuous Integration Status](https://github.com/mitmproxy/mitmproxy/workflows/CI/badge.svg?branch=main)](https://github.com/mitmproxy/mitmproxy/actions?query=branch%3Amain)
[![Coverage Status](https://shields.mitmproxy.org/codecov/c/github/mitmproxy/mitmproxy/main.svg?label=codecov)](https://codecov.io/gh/mitmproxy/mitmproxy)
[![Latest Version](https://shields.mitmproxy.org/pypi/v/mitmproxy.svg)](https://pypi.python.org/pypi/mitmproxy)
[![Supported Python versions](https://shields.mitmproxy.org/pypi/pyversions/mitmproxy.svg)](https://pypi.python.org/pypi/mitmproxy)

``mitmproxy`` is an interactive, SSL/TLS-capable intercepting proxy with a console
interface for HTTP/1, HTTP/2, and WebSockets.

``mitmdump`` is the command-line version of mitmproxy. Think tcpdump for HTTP.

``mitmweb`` is a web-based interface for mitmproxy.

## Installation

The installation instructions are [here](https://docs.mitmproxy.org/stable/overview-installation).
If you want to install from source, see [CONTRIBUTING.md](./CONTRIBUTING.md).

## Documentation & Help

General information, tutorials, and precompiled binaries can be found on the mitmproxy website.

[![mitmproxy.org](https://shields.mitmproxy.org/badge/https%3A%2F%2F-mitmproxy.org-blue.svg)](https://mitmproxy.org/)

The documentation for mitmproxy is available on our website:

[![mitmproxy documentation stable](https://shields.mitmproxy.org/badge/docs-stable-brightgreen.svg)](https://docs.mitmproxy.org/stable/)
[![mitmproxy documentation dev](https://shields.mitmproxy.org/badge/docs-dev-brightgreen.svg)](https://docs.mitmproxy.org/main/)

If you have questions on how to use mitmproxy, please
ask them on StackOverflow!

[![StackOverflow: mitmproxy](https://shields.mitmproxy.org/stackexchange/stackoverflow/t/mitmproxy?color=orange&label=stackoverflow%20questions)](https://stackoverflow.com/questions/tagged/mitmproxy)

## Contributing

As an open source project, mitmproxy welcomes contributions of all forms.

[![Dev Guide](https://shields.mitmproxy.org/badge/dev_docs-CONTRIBUTING.md-blue)](./CONTRIBUTING.md)

Also, please feel free to join our developer Slack!

[![Slack Developer Chat](https://shields.mitmproxy.org/badge/slack-mitmproxy-E01563.svg)](http://slack.mitmproxy.org/)
