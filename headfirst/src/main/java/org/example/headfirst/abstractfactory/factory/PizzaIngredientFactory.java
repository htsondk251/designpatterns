package org.example.headfirst.abstractfactory.factory;

import org.example.headfirst.abstractfactory.ingredients.*;

/**
 * @version 1.0
 * @description:
 * @author: sonhoangthanh
 * @date: 08/05/2025 11:55
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
