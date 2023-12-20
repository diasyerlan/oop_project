package proj;

import java.io.IOException;
import java.util.Vector;

public class Test {
    public static void main(String[] args) throws IOException {

//        Vector<Course> universityCourses = new Vector<>();
//        universityCourses.add(new Course("Computer Science", 4, "CSS101", 50));
//        universityCourses.add(new Course("Mathematics", 3, "MAT201", 40));
//        universityCourses.add(new Course("Physics", 4, "PHY301", 30));
//        universityCourses.add(new Course("History", 3, "HIS101", 35));
//        universityCourses.add(new Course("Chemistry", 4, "CHM201", 45));
//        universityCourses.add(new Course("Literature", 3, "LIT301", 30));
//        universityCourses.add(new Course("Economics", 4, "ECO101", 40));
//        universityCourses.add(new Course("Psychology", 3, "PSY201", 35));
//        universityCourses.add(new Course("Biology", 4, "BIO301", 40));
//        universityCourses.add(new Course("Political Science", 3, "POLI101", 35));
//        Serialization.write(universityCourses, "Courses.txt");

//        Vector<Book> books = new Vector<>();
//        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 101, LocalDate.of(1925, 4, 10), "English"));
//        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 102, LocalDate.of(1960, 7, 11), "English"));
//        books.add(new Book("1984", "George Orwell", 103, LocalDate.of(1949, 6, 8), "English"));
//        books.add(new Book("Pride and Prejudice", "Jane Austen", 104, LocalDate.of(1813, 1, 28), "English"));
//        books.add(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 105, LocalDate.of(1967, 5, 30), "Spanish"));
//        books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", 106, LocalDate.of(1866, 1, 22), "Russian"));
//        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 107, LocalDate.of(1937, 9, 21), "English"));
//        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 108, LocalDate.of(1951, 7, 16), "English"));
//        books.add(new Book("Moby-Dick", "Herman Melville", 109, LocalDate.of(1851, 10, 18), "English"));
//        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 110, LocalDate.of(1954, 7, 29), "English"));
//        books.add(new Book("Anna Karenina", "Leo Tolstoy", 111, LocalDate.of(1877, 3, 14), "Russian"));
//        books.add(new Book("Brave New World", "Aldous Huxley", 112, LocalDate.of(1932, 6, 11), "English"));
//        books.add(new Book("The Odyssey", "Homer", 113, LocalDate.of(8, 1, 1), "Ancient Greek"));
//        books.add(new Book("Frankenstein", "Mary Shelley", 114, LocalDate.of(1818, 1, 1), "English"));
//        books.add(new Book("The Alchemist", "Paulo Coelho", 115, LocalDate.of(1988, 1, 1), "Portuguese"));
//        books.add(new Book("The Brothers Karamazov", "Fyodor Dostoevsky", 116, LocalDate.of(1880, 11, 11), "Russian"));
//        books.add(new Book("The Count of Monte Cristo", "Alexandre Dumas", 117, LocalDate.of(1844, 8, 28), "French"));
//        books.add(new Book("The Picture of Dorian Gray", "Oscar Wilde", 118, LocalDate.of(1890, 7, 20), "English"));
//        books.add(new Book("The Iliad", "Homer", 119, LocalDate.of(8, 1, 1), "Ancient Greek"));
//        books.add(new Book("The Divine Comedy", "Dante Alighieri", 120, LocalDate.of(1320, 1, 1), "Italian"));
//        Serialization.write(books, "LibraryBooks.txt");
//        for (Pair<String, Vector<Book>> p : Data.studentBooks) {
//            System.out.println(p.first);
//            for (Book b : p.second) {
//                System.out.println(b.getName());
//
//            }
//        }
//    System.out.println("\n");
//        String respond = "";
//        for(Pair<Vector<String>, String> p : Data.requestedBooks) {
//            respond += "The student ID is " + p.second + '\n';
//            respond += "Requested Books: \n";
//            for(String s : p.first) {
//                respond += s + '\n';
//            }
//            respond += '\n';
//
//        }
//        System.out.println(respond + "\n");
//        for(Book b: Data.books) {
//            System.out.println(b.getName());
//        }

        Vector<StudentOrganization> vec = new Vector<>();
        vec.add(new StudentOrganization("OSIT", 1));
        vec.add(new StudentOrganization("ArtHouse", 2));
        vec.add(new StudentOrganization("Enactus", 3));
        vec.add(new StudentOrganization("StudEx", 4));
        vec.add(new StudentOrganization("BCL", 5));
        Serialization.write(vec, "Database/StudentOrganizations.txt");
    }

}
