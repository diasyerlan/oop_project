package proj;

import java.util.HashMap;
import java.util.Map;

public class LanguageMessages {
    private static final Map<String, Map<Integer, String>> messages = new HashMap<>();

    static {
        Map<Integer, String> enMessages = new HashMap<>();
        enMessages.put(1, "Welcome to Virtual University System! Please sign in:");
        enMessages.put(2, "Username: ");
        enMessages.put(3, "Password: ");
        enMessages.put(4, "Welcome, Admin! Here are the actions you can perform:\n0 - Show all users\n1 - Add User\n2 - Remove User\n3 - Update User\nType the appropriate number to take action: ");
        enMessages.put(5, "Enter the ID of user you want to remove:");
        enMessages.put(6, "Enter the ID of user you want to update:");
        enMessages.put(7, "Welcome! Here are the actions you can perform: ");
        enMessages.put(8, "0 - View Transcript\n1 - Register for Course\n2 - view Schedul\n3 - Take a book from Library\n4 - Return book from Library\n5 - View Books Taken\n6 - View Student Organizations you are in\n7 - Pay Student Fee");
        enMessages.put(9, "Type the appropriate number to take action: ");
        enMessages.put(10, "Your request for registration is already sent to OR! Please wait!");
        enMessages.put(11, "You are already registered for courses!");
        enMessages.put(12, "Your request for registration is sent to OR!");
        enMessages.put(13, "Write the name of the books you want to get from Library(by coma): ");
        enMessages.put(14, "The request is sent successfully!");
        enMessages.put(15, "Write the name of the books you want to return to Library(by coma): ");
        enMessages.put(16, "Returned successfully ");
        enMessages.put(1, "You have no book from library!");
        enMessages.put(1, "Here are the books you have taken from library: ");
        enMessages.put(1, "You are not a member of any Student Organization. Select one of these: ");
        enMessages.put(1, "Congrats! You become member of Organization");
        enMessages.put(1, "Organization is full of students!");
        enMessages.put(1, "You are already a member of this Organization");
        enMessages.put(1, "You are going to pay Student Fee for current semester. Choose method of Payment: \n1 - Kaspi\n2 - Halyk\n 3 - Cash");
        enMessages.put(1, "0 - add courses for Student\n1 - Send work Messages\n2 - View work Messages");
        enMessages.put(1, "Type the appropriate number to take action: ");
        enMessages.put(1, "Type the ID of the Student: ");
        enMessages.put(1, "The student is not approved for Registration. Type 'ok' to confirm: ");
        enMessages.put(1, "The request is approved!");
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );
        enMessages.put(1, );


        // Add more English messages as needed

        Map<Integer, String> kzMessages = new HashMap<>();
        kzMessages.put(1, "Виртуалды Университет жүйесіне қош келдіңіз. Жүйеге кіріңіз: ");
        kzMessages.put(2, "Пайдаланушы аты: ");
        // Add more Kazakh messages as needed

        Map<Integer, String> ruMessages = new HashMap<>();
        ruMessages.put(3, "Добро пожаловать в виртуальную систему университета! Пожалуйста, войдите:");
        ruMessages.put(2, "Имя пользователя: ");
        // Add more Russian messages as needed

        messages.put("en", enMessages);
        messages.put("kz", kzMessages);
        messages.put("ru", ruMessages);
    }

    public static Map<Integer, String> getEnMessage() {
        return messages.get("en");
    }
    public static Map<Integer, String> getKzMessage() {
        return messages.get("kz");
    }
    public static Map<Integer, String> getRuMessage() {
        return messages.get("ru");
    }
}