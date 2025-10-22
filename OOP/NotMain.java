package OOP;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class NotMain {
    public static void main(String[] args){

        Path p = Paths.get("Shrava", "test.txt");

        try {
            List<String> lines = Files.readAllLines(p);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}