/**
 * Library class
 */
public class Library {


    String name;
    Address location;
    Book[] books;
    Member[] members;
    Book book = new Book();


    /**
     * addBook(Book) : void
     * Creates a new array which is a copy of this.books, but, whose length is
     * this.books.length + 1, to be able to add the new book.
     *
     * this.books is then replaced by the new array.
     *
     * @param book
     *          A new book object to add to the books list
     */
    public void addBook(Book book) {
        Book[] books = new Book[(this.books).length + 1];

        for (int i = 0; i < books.length; i++){
            if (i != books.length -1){
                books[i] = (this.books)[i];
            } else{
                books[i].title = book.title;
            }
        }
        this.books = books;
    }




    /**
     * addMember(Member) : void
     * Creates a new array which is a copy of this.members, but, whose length is
     * this.members.length + 1, to be able to add the new member.
     *
     * this.members is then replaced by the new array.
     *
     * @param member
     *          A new member object to add to the members list
     */
    public void addMember(Member member){
        Member[] members = new Member[(this.members).length + 1];
        for (int i = 0; i < members.length; i++){
            if (i != members.length - 1){
                members[i] = (this.members)[i];
            } else{
                members[i].name = member.name;
            }
        }
    }
