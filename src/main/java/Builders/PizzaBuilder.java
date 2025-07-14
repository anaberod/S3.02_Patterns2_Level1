package Builders;

import Pizza.Pizza;

public interface PizzaBuilder {
    void setSize();
    void setDough();
    void addToppings();
    Pizza build();
}
