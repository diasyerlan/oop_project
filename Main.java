package proj;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = Admin.getInstance();

        System.out.println("Select the system language(kz, en, rus):");
        String language = scanner.nextLine();
        if(language.equals("en")) {
            System.out.println("Welcome to Virtual University System! Please sign in:");

            while(true) {
                System.out.print("Username: ");
                String username = scanner.nextLine();

                System.out.print("Password: ");
                String password = scanner.nextLine();

                if(admin.username.equals(username) && admin.password.equals(password)) {
                    System.out.println("Welcome, Admin! Here are the actions you can perform:");
                    break;
                }
                else {
                    System.out.println("Incorrect uername or password. Try again:");
                }

            }
        }
    }
}
