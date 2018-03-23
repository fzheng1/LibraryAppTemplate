class Book {
    String title;
    String author;
    String[] pages;

    public String toString() {
        String pagesString = "";
        for (String page:pages) {
            pagesString += page + " ";
        }
        return pagesString;
    }

    public String censorPage(int page) {
        return(pages[page] = "-");


    }
}
