public class Main {
   public static void main(String[] args) {
      String[][] toppings = {
              {"Pepperoni"},
              {"Pepperoni", "Mushrooms"},
              {"Sausage", "Onions", "Peppers"},
              {"Ham", "Pineapple", "Extra Cheese", "Bacon"}
      };

      for (int i=0; i < toppings.length; i++) {
         String[] topping = toppings[i];
         Pizza pizza = new Pizza(topping, topping.length);

         DeliveryPizza delivery = new DeliveryPizza(topping, "123 Pizza Street", topping.length);

         System.out.println("Pizza " + (i + 1) + ":");
         System.out.println(pizza);
         System.out.println();
         System.out.println("Pizza Delivery " + (i + 1) + ":");
         System.out.println(delivery);
         System.out.println();
      }
   }
}