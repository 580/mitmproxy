# -*- encoding: utf-8 -*-

=begin
#BrowserUp Proxy

#___ This is the REST API for controlling the BrowserUp Proxy.  The BrowserUp Proxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

$:.push File.expand_path("../lib", __FILE__)
require "browserup_proxy_client/version"

Gem::Specification.new do |s|
  s.name        = "browserup_proxy_client"
  s.version     = BrowserupProxy::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["BrowserUp"]
  s.email       = ["hello@browserup.com"]
  s.homepage    = "https://browserup.com"
  s.summary     = "Client for the BrowserUp Proxy, an automated testing swiss army knife"
  s.description = "A REST client for the browserup-proxy"
  s.license     = "Unlicense"
  s.required_ruby_version = ">= 2.3"

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
