package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalRepository {
    private Connection connection;

    public AnimalRepository() {
        // Здесь укажите ваши параметры подключения
        String url = "jdbc:mysql://localhost:3306/animalshelter";
        String user = "root";
        String password = "1207";

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addAnimal(Pet pet) {
        String sql = "INSERT INTO animals (name, commands, birth_date, type) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, pet.getName());
            statement.setString(2, pet.getCommands());
            statement.setString(3, pet.getBirthDate());
            statement.setString(4, pet.getType());

            statement.executeUpdate();
            System.out.println("Животное добавлено в базу данных.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}