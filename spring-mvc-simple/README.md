### About JUnit4 `@ContextConfiguration` ,there are 3 ways to configure:
+ @ContextConfiguration("file:src/main/resources/spring-mvc.xml")
+ @ContextConfiguration(locations = {"classpath:spring-mvc.xml"})
+ @ContextConfiguration(locations = {"file:src/main/resources/spring-mvc.xml"})

> TODO: resolve @Value inject value from config.properties