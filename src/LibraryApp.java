import java.util.Scanner;

public class LibraryApp {

    private static Library library = new Library();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. List Members\n2. List Books\n3. Display Mailing Address for Library");
        String input = scan.nextLine();

        if (input.equals("1")) {
            for (int i = 0; i < library.members.length; i++) {
                Member member = library.members[i];
                System.out.println(member.name);
            }
        }

        else if (input.equals("2")) {
                for (int i = 0; i < library.books.length; i++) {
                    Book book = library.books[i];
                    System.out.println(book.title);
                }
            }

        else if (input.equals("3")) {
            System.out.println(library.name);
            System.out.println(library.location);
        }

    }


}
