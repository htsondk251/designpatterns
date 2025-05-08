package org.example.headfirst.abstractfactory;

/**
 * @version 1.0
 * @description:
 * @author: sonhoangthanh
 * @date: 07/05/2025 17:32
 */
public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
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

    public static void main(String[] args) {
        NYPizzaFactory nypizzaFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nypizzaFactory);
        nyStore.orderPizza("cheese");


        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        chicagoStore.orderPizza("cheese");
    }
}
