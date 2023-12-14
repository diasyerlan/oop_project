package proj;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the system language(kz, en, rus):");
        String language = scanner.nextLine();
        if(language.equals("en")) {
            System.out.println("Welcome to Virtual University System! Please sign in:");

            System.out.print("Username:");
            String username = scanner.nextLine();

            System.out.print("Username:");
            String password = scanner.nextLine();


        }
    }
}
