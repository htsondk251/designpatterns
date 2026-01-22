package org.example.headfirst.abstractfactory;

import org.example.headfirst.abstractfactory.factory.PizzaIngredientFactory;

/**
 * @version 1.0
 * @description:
 * @author: sonhoangthanh
 * @date: 08/05/2025 12:09
 */
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super();
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        veggies = ingredientFactory.createVeggies();
    }
}
