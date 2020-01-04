# How to run

```
mvn package
java -jar target/qualifierexample-0.0.1-SNAPSHOT.jar
```

# Changes

1. Add **maven-jar-plugin** to **pom.xml** to make jar executable

2.  Add **maven-shade-plugin** to **pom.xml** to build all dependencies to jar file, otherwise we have to assign all dependencies to -classpath