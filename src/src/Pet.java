package src;

public class Pet {
    private String name;
    private String commands;
    private String birthDate;
    private String type;

    public Pet(String name, String commands, String birthDate, String type) {
        this.name = name;
        this.commands = commands;
        this.birthDate = birthDate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getCommands() {
        return commands;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', commands='" + commands + "', birthDate='" + birthDate + "', type='" + type + "'}";
    }
}