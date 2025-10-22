package UService;

public class UserService {

    public static void test(String email, String password) throws Exception {
            if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
                throw new Exception("Email or Password cannot be empty");
            }
            if (!email.contains("@")) {
                throw new Exception("Invalid email format");
            }
            if (password.length() < 6) {
                throw new Exception("Password must be at least 6 characters long");
            }
            System.out.println("User validation successful");
        }
    } 