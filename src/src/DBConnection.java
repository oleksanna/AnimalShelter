package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/AnimalShelter";
    private static final String USER = "root"; // Замените на ваше имя пользователя
    private static final String PASSWORD = "1207"; // Замените на ваш пароль

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
