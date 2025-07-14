package Builders;

import Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class FourCheeseBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();


    @Override
    public void setSize() {

        this.size = "Large";
    }

    @Override
    public void setDough() {
        this.dough = "Thin";

    }

    @Override
    public void addToppings() {
        toppings.add("Mozarella");
        toppings.add("Cheddar");
        toppings.add("Parmesan");
        toppings.add("Gorgonzola");

    }

    @Override
    public Pizza build() {

        return new Pizza(size, dough, toppings);
    }
}
