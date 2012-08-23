## Introduction

Embedding jetty server in any ide, The code in this tested from Jetty 8.

## Crucial Files

* pom.xml
* src/main/resources/jetty.xml

## Usage

	String[] args = new String[] { "src/main/resources/jetty.xml" };
	XmlConfiguration.main(args);