package com.juanpabloprado.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String[] args) throws SQLException {
        DbSingleton dbSingleton = DbSingleton.getInstance();

        System.out.println(dbSingleton);

        Connection connection = dbSingleton.getConnection();

        Statement statement = connection.createStatement();

        statement.execute("Create table students (id int primary key, name varchar(65))");

        System.out.println("Create table students.");

        int rows = statement.executeUpdate("Insert into students (id, name) values (1, 'Juan Pablo')");

        if (rows > 0) {
            System.out.println("Inserted a new row");
        }

        connection.close();
    }
}
