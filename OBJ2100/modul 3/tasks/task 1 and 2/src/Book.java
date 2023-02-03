public abstract class Book {
    // fields
    private String title;
    protected double price; // her endrer jeg fra private til protected for å kunne aksessere i underklassene - må sjekke om dette er riktig måte å gjøre det på

    // constructor
    public Book(String title) {
        this.title = title;
    }

    // getters

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public abstract void setPrice();

    public void printInfo() { // Denne metoden printer ut verdiene avhengig av hvilken underklasse som blir brukt
        System.out.println("the title is: " + this.getTitle());
        System.out.println("The price is: " + this.getPrice());

        System.out.println("");
    }

}
