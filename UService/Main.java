package Shrava.ClassWorks.UService;

public class Main {
    public static void main(String[] args) {
        String email = "testexample.com"; 
        String password = "12345";

        try {
            UserService.test(email, password);
        } 
        catch (Exception e) {
            System.out.println("⚠ Error: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}

