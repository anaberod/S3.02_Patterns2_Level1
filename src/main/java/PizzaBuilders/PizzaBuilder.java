package PizzaBuilders;

public interface PizzaBuilder {
    void setSize();
    void setDough();
    void addToppings();
    Pizza getPizza();
}
