package ru.fresk.db.lab.util;

import java.util.Properties;

public final class DbParams {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/graphs";
    public static final Properties PROPERTIES;

    static {
        Properties props = new Properties();
        props.setProperty("user", "db-lab");
        props.setProperty("password", "db-lab");
        PROPERTIES = props;
    }

    private DbParams() {
    }
}
