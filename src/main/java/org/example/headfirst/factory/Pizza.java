package org.example.headfirst.factory;

/**
 * @version 1.0
 * @description:
 * @author: sonhoangthanh
 * @date: 07/05/2025 17:33
 */
public abstract class Pizza {
    String name;

    String dough;

    String sauce;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}
