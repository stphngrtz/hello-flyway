package de.stphngrtz.helloflyway;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import spark.Spark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static de.stphngrtz.helloflyway.tables.Author.AUTHOR;

public class Main {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.load(Main.class.getClassLoader().getResourceAsStream("db/config.properties"));

        Connection connection = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.username"), p.getProperty("db.password"));
        DSLContext ctx = DSL.using(connection, SQLDialect.POSTGRES);

        Spark.get("/", (request, response) -> "Hello!");

        Spark.get("/authors", (request, response) -> ctx
                .selectFrom(AUTHOR)
                .fetch()
                .formatJSON()
        );
    }
}
