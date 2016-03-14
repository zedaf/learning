// package demonstration
package bookpack;

class PackageDemo {
    public static void main(String args[]) {
        Book books[] = new Book[2];

        books[0] = new Book("Java 1 reference book", "schildt", 2014);
        books[1] = new Book("blah blah", "balls", 2015);

        for(int i=0; i < books.length; i++) {
            books[i].show();
        }
    }
}