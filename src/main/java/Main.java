import PizzaBuilders.FourCheeseBuilder;
import PizzaBuilders.HawaiianPizzaBuilder;
import PizzaBuilders.Pizza;
import PizzaBuilders.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaChef chef = new PizzaChef(hawaiianBuilder);
        Pizza HawaiianPizza = chef.makePizza();
        System.out.println(HawaiianPizza);


        PizzaBuilder fourCheeseBuilder = new FourCheeseBuilder();
        PizzaChef chef1 = new PizzaChef(fourCheeseBuilder);
        Pizza FourcheesePizza = chef1.makePizza();
        System.out.println(FourcheesePizza);

    }
}
