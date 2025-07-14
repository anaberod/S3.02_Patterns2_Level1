package Builders;

import Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class FlexiblePizzaBuilder {
    private String size;
    private String dough;
    private final List<String> toppings = new ArrayList<>();

    public FlexiblePizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public FlexiblePizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    public FlexiblePizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        if (size == null || dough == null || toppings.isEmpty()) {
            throw new IllegalStateException("Pizza must have size, dough, and at least one topping.");
        }
        return new Pizza(size, dough, toppings);
    }
}
