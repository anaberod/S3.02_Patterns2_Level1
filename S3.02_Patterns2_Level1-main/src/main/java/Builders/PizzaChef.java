package Builders;

import Pizza.Pizza;

public class PizzaChef {
    private PizzaBuilder builder;

    public PizzaChef(PizzaBuilder builder) {

        this.builder = builder;
    }

    public Pizza makePizza() {
        builder.setSize();
        builder.setDough();
        builder.addToppings();
        return builder.build();
    }
}
