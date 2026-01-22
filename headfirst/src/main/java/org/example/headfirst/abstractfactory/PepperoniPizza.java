package org.example.headfirst.abstractfactory;

import org.example.headfirst.abstractfactory.factory.PizzaIngredientFactory;

/**
 * @version 1.0
 * @description:
 * @author: sonhoangthanh
 * @date: 08/05/2025 12:11
 */
public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        pepperoni = ingredientFactory.createPepperoni();
    }
}
