public class BookArray {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];

        bookArray[0] = new Fiction("fiction 1");
        bookArray[1] = new Fiction("fiction 2");
        bookArray[2] = new Fiction("fiction 3");
        bookArray[3] = new Fiction("fiction 4");
        bookArray[4] = new Fiction("fiction 5");
        bookArray[5] = new NonFiction("nonfiction 1");
        bookArray[6] = new NonFiction("nonfiction 2");
        bookArray[7] = new NonFiction("nonfiction 3");
        bookArray[8] = new NonFiction("nonfiction 4");
        bookArray[9] = new NonFiction("nonfiction 5");

        for(int i = 0; i < bookArray.length; i++) {
            bookArray[i].printInfo();
        }
    }
}
