public class Pizza {
    String[] toppings = new String[10];
    double price;
    String description;

    public Pizza(String[] toppings, int amtToppings) {

        for (int i = 0; i < amtToppings; i++) {
            this.toppings[i] = toppings[i];
        }

        description = "Toppings: ";
        price = 14;

        for (int i = 0; i < amtToppings; i++){
            description += this.toppings[i];
            if (i < amtToppings - 1) {
                description += ", ";
            }
            price += 2;
        }
    }

    public String toString() {
        return description + "\n" + "Pizza Price: $" + price;
    }
}
