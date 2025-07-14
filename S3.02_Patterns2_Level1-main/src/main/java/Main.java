import Builders.*;
import Pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaChef chef = new PizzaChef(hawaiianBuilder);
        Pizza hawaiianPizza = chef.makePizza();
        System.out.println("Hawaiian pizza: ");
        System.out.println(hawaiianPizza);


        PizzaBuilder fourCheeseBuilder = new FourCheeseBuilder();
        PizzaChef chef1 = new PizzaChef(fourCheeseBuilder);
        Pizza fourcheesePizza = chef1.makePizza();
        System.out.println("Four cheese pizza: ");
        System.out.println(fourcheesePizza);



    Pizza customPizza = new FlexiblePizzaBuilder()
            .setDough("Super dough")
            .setSize("Familiar size")
            .addTopping("Peperonni")
            .addTopping("Tuna")

            .build();
    System.out.println("Custom pizza ");
        System.out.println(customPizza);

    }
}
