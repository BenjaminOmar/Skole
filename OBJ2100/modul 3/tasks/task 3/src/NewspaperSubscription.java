public abstract class NewspaperSubscription {
    private String subscriberName;
    private String address;
    private double rate;

    // getters and setters

    public void setSubscriberName(String subName) {
        this.subscriberName = subName;
    }

    public String getSubscriberName() {
        return this.subscriberName;
    }

    public String getAdress() {
        return this.address;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public abstract void setAdress(String adress);

    public void showInfo() {
        System.out.println("");
        System.out.println("The subscriber name is: " + subscriberName);
        System.out.println("The adress is: " + this.subscriberName);
        System.out.println("the subscription rate is: " + rate + "$");
    }

}
