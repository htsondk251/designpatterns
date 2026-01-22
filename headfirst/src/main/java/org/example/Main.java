package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> test = new HashSet<>();

        System.out.println(test.add(null));
        System.out.println(test.add(null));
    }
}