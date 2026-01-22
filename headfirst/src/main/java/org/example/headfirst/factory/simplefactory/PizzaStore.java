package org.example.headfirst.factory.simplefactory;

/**
 * @version 1.0
 * @description:
 * @author: sonhoangthanh
 * @date: 07/05/2025 17:32
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
