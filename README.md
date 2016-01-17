# hello-flyway

* Spark (http://sparkjava.com)
* Flyway (http://www.sql2o.org)
* JOOQ (http://www.jooq.org)

```
docker run --name postgres -e POSTGRES_USER=stephan -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres:9

mvn clean package && java -jar ./target/hello-flyway-1.0-SNAPSHOT.jar

safari http://localhost:4567/authors
```
