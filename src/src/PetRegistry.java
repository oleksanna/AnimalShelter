package src;

import java.util.Scanner;

public class PetRegistry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите команды (через запятую): ");
        String commands = scanner.nextLine();

        System.out.print("Введите дату рождения (YYYY-MM-DD): ");
        String birthDate = scanner.nextLine();

        System.out.print("Выберите тип (Domestic/Pack): ");
        String type = scanner.nextLine();

        Pet pet;
        if (type.equalsIgnoreCase("Domestic")) {
            pet = new DomesticAnimal(name, commands, birthDate);
        } else {
            pet = new PackAnimal(name, commands, birthDate);
        }

        // Создаем экземпляр AnimalRepository и добавляем животное в базу данных
        AnimalRepository animalRepository = new AnimalRepository();
        animalRepository.addAnimal(pet);

        System.out.println("Имя животного: " + pet.getName());
        System.out.println("Команды: " + pet.getCommands());
        System.out.println("Дата рождения: " + pet.getBirthDate());
        System.out.println("Тип: " + pet.getType());

        scanner.close();
    }
}