public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physical = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription online = new OnlineNewspaperSubscription();

        // with correct inputted values
        physical.setSubscriberName("Benjamin");
        physical.setAdress("Test adresse 1");

        online.setSubscriberName("Stine");
        online.setAdress("Stine@gmail.com");
        
        physical.showInfo();
        online.showInfo();

        System.out.println("---------------------------------");

        // with uncorrect written values
        physical.setSubscriberName("Benjamin");
        physical.setAdress("Test adresse en");

        online.setSubscriberName("Stine");
        online.setAdress("Stinegmail.com");

        physical.showInfo();
        online.showInfo();
    }


}
