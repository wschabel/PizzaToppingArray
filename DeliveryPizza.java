public class DeliveryPizza extends Pizza{
    double deliveryFee;
    String deliveryAddress;

    public DeliveryPizza(String[] toppings, String address, int amtToppings) {
        super(toppings, amtToppings);

        this.deliveryAddress = address;

        if (this.price > 18) {
            this.deliveryFee = 3.00;
        } else {
            this.deliveryFee = 5.00;
        }
    }

    public String toString() {
        return this.description
                + "\nPizza Price: $" + this.price
                + "\nAddress: " + this.deliveryAddress
                + "\nDelivery Fee: $" + this.deliveryFee
                + "\nTotal Cost: $" + (this.price + this.deliveryFee);
    }
}
