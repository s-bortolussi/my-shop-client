# MyShop client

A sample OAuth2 client app with SSO.

# Architecture details

See [Spring boot OAuth 2.0](https://docs.spring.io/spring-security-oauth2-boot/docs/current-SNAPSHOT/reference/htmlsingle/) for details.

# Running MyShop client
```bash

#Set OAuth 2.0 Authorization Server basic authentication
$ export SECURITY_OAUTH2_CLIENT_CLIENT_ID: <?>
$ export SECURITY_OAUTH2_CLIENT_CLIENT_SECRET: <?>
$ export SECURITY_OAUTH2_CLIENT_SCOPE= <?>
$ export SECURITY_OAUTH2_CLIENT_REGISTEREDREDIRECTURI= <?>
$ export SECURITY_OAUTH2_CLIENT_AUTHENTICATIONSCHEME= <?>
$ export SECURITY_OAUTH2_RESOURCE_USERINFOURI= <?>


$ ../mvnw package
$ java -jar target/*.jar
```

# Running MyShop client
open http://localhost:8080/index.html

```




 
