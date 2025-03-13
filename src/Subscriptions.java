public class Subscriptions {
    private double totalCost;
    private double amountPerPaycheck;


    Subscriptions(double totalCost, double amountPerPaycheck){
        this.totalCost = totalCost;
        this.amountPerPaycheck = amountPerPaycheck;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getAmountPerPaycheck() {
        return amountPerPaycheck;
    }

    public void setAmountPerPaycheck(double amountPerPaycheck) {
        this.amountPerPaycheck = amountPerPaycheck;
    }
}
