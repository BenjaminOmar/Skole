public class OnlineNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAdress(String adress) {
       if(!adress.contains("@")) {
            System.out.println("Error - the adress needs to contain an @");
            this.setRate(0);
       }
       else {
        this.setRate(9);
       }
        
    }
    
}
