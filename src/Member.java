/**
 * Member class
 */
public class Member {

    String name;
    int birthYear;
    Address address;

    Book book = new Book();

    /**
     * getAge() : int
     * Instance method to calculate the member's age.
     * @return
     *          returns the member's age as an int.
     */
    public int getAge() {

        int age = 2018 - birthYear;
        return age;
    }


    /**
     * readBook(Book) : void
     * Will "read" a book give to the member.
     * "Reading" consists of printing out any appropriate message
     * containing the title of the book.
     *
     * @param book
     *          The book to read.
     */
    public void readBook(Book book){

        System.out.println("The book you are reading is: " + book.title);
    }


}
