public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAdress(String adress) {
        if(!adress.matches(".*[0-9].*")) {
            System.out.println("Error - The adress does not contain the Adress number");
            this.setRate(0);
        }
        else {
            this.setRate(15);
        }
    }
    
}
