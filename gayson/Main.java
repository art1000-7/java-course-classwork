import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class User {
    String name;
    int age;
    String email;

    public User() {}
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // 1️⃣ Десериализация
        try (FileReader reader = new FileReader("Input.txt")) {
            User inputUser = gson.fromJson(reader, User.class);
            System.out.println("✅ Прочитано из Input.txt:");
            System.out.println("Имя: " + inputUser.name);
            System.out.println("Возраст: " + inputUser.age);
            System.out.println("Email: " + inputUser.email);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        // 2️⃣ Сериализация
        User newUser = new User("Alice", 25, "alice@gmail.com");

        try (FileWriter writer = new FileWriter("Output.txt")) {
            gson.toJson(newUser, writer);
            System.out.println("✅ Новый JSON записан в Output.txt");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}
