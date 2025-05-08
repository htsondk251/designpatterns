package org.example.headfirst.abstractfactory;

import org.example.headfirst.abstractfactory.factory.PizzaIngredientFactory;

/**
 * @version 1.0
 * @description:
 * @author: sonhoangthanh
 * @date: 08/05/2025 12:04
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
