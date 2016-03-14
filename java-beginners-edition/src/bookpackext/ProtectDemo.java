// Demonstrate protected

package bookpackext;

class ExtBook extends bookpack.Book {

    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }
}

class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("java a beginners guide", "schildt", 2014, "mcgraw");
        books[1] = new ExtBook("java a beginners guide", "schildt", 2014, "mcgraw");
        books[2] = new ExtBook("art of java", "schildt and homes", 2014, "mcgraw");
        books[3] = new ExtBook("the division", "clancy", 2016, "ubisoft");
        books[4] = new ExtBook("your mom", "fabiani", 2016, "me");

        for(int i=0; i < books.length; i++) books[i].show();

        // find books by author

        System.out.println("Showing all books by Schildt.");
        for(int i=0; i < books.length; i++)
            if(books[i].getAuthor() == "schildt")
                System.out.println(books[i].getTitle());

        // books[0].title = "test title";  //Error - not accessible
    }
}
