package Builders;

import Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();


    @Override
    public void setSize() {

        this.size = "Medium";
    }

    @Override
    public void setDough() {
        this.dough = "Classic";

    }

    @Override
    public void addToppings() {
        toppings.add("Pineapple");
        toppings.add("Mozarella");

    }

    @Override
    public Pizza build() {

        return new Pizza(size,dough,toppings);
    }
}
