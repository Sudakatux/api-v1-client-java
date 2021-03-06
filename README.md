#Blockchain API library (Java, v1)

An official Java library for interacting with the Blockchain.info API (Java 1.6 required).

###Getting started

If you prefer building from source:

```
$ git clone https://github.com/blockchain/api-v1-client-java
$ cd api-v1-client-java
$ mvn install
```

We also provide a snapshot Maven repository for users who prefer managing dependencies that way.

Add the following repository to your pom.xml:
```xml
    <repository>
        <id>api-v1-client-java-mvn-repo</id>
        <url>https://raw.githubusercontent.com/blockchain/api-v1-client-java/mvn-repo/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
    </repository>
```

Add the following dependency to your pom.xml:
```xml
  <dependency>
  	<groupId>info.blockchain</groupId>
  	<artifactId>api</artifactId>
  	<version>1.0.1</version> <!-- for the latest version see the latest project tag -->
  </dependency>
```

Note that the above procedures require Maven. If you do not wish to use Maven, please compile the source manually.

The library consists of the following packages:

* `info.blockchain.api.blockexplorer` ([docs](docs/blockexplorer.md)) ([api/blockchain_api][api1])
* `info.blockchain.api.createwallet` ([docs](docs/createwallet.md)) ([api/create_wallet][api2])
* `info.blockchain.api.exchangerates` ([docs](docs/exchangerates.md)) ([api/exchange\_rates\_api][api3])
* `info.blockchain.api.receive` ([docs](docs/receive.md)) ([api/api_receive][api4])
* `info.blockchain.api.statistics` ([docs](docs/statistics.md)) ([api/charts_api][api5])
* `info.blockchain.api.wallet` ([docs](docs/wallet.md)) ([api/blockchain\_wallet\_api][api6])

###Error handling

All methods may throw exceptions caused by incorrectly passed parameters or other problems. If a call is rejected server-side, the `APIException` exception will be thrpwn. In case of a network error, the `IOException` exception will be thrown.

###Request limits and API keys

In order to prevent abuse some API methods require an API key approved with some basic contact information and a description of its intended use. Please request an API key [here](https://blockchain.info/api/api_create_code).

The same API key can be used to bypass the request limiter.

[api1]: https://blockchain.info/api/blockchain_api
[api2]: https://blockchain.info/api/create_wallet
[api3]: https://blockchain.info/api/exchange_rates_api
[api4]: https://blockchain.info/api/api_receive
[api5]: https://blockchain.info/api/charts_api
[api6]: https://blockchain.info/api/blockchain_wallet_api