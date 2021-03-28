# gfc-crypto [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.gfccollective/gfc-crypto_2.12/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/org.gfccollective/gfc-crypto_2.12) [![Build Status](https://github.com/gfc-collective/gfc-crypto/workflows/Scala%20CI/badge.svg)](https://github.com/gfc-collective/gfc-crypto/actions) [![Coverage Status](https://coveralls.io/repos/gfc-collective/gfc-crypto/badge.svg?branch=main&service=github)](https://coveralls.io/github/gfc-collective/gfc-crypto?branch=main)

A library that contains cryptography related scala utility classes.
A fork and new home of the now unmaintained Gilt Foundation Classes (`com.gilt.gfc`), now called the [GFC Collective](https://github.com/gfc-collective), maintained by some of the original authors.


## Getting gfc-crypto

The latest version is 1.0.0, released on 21/Jan/2020 and cross-built against Scala 2.12.x and 2.13.x.

If you're using SBT, add the following line to your build file:

```scala
libraryDependencies += "org.gfccollective" %% "gfc-crypto" % "1.0.0"
```

For Maven and other build tools, you can visit [search.maven.org](http://search.maven.org/#search%7Cga%7C1%7Corg.gfccollective).
(This search will also list other available libraries from the GFC Collective.)

## Contents and Example Usage

### org.gfccollective.crypto.HashFunctions

Helper library to create cryptographic hashes (SHA-256, SHA-512, of input Strings. For a complete list of supported
message digest (hash) formats see the documentation for java.security.MessageDigest.

## License

Licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0
