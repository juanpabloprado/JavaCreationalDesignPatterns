package com.juanpabloprado.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private Connection connection = null;

    private static class LazyHolder {
        @SuppressWarnings("InstantiationOfUtilityClass")
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton() {
        try {
            String jdbcUrl = "jdbc:h2:mem:test";
            connection = DriverManager.getConnection(jdbcUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
}
