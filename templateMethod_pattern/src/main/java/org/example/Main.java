package org.example;

import org.example.concreteDrinks.PrepareCoffe;
import org.example.concreteDrinks.PrepareHotChocolate;
import org.example.concreteDrinks.PrepareTea;
import org.example.template.PrepareDrink;


public class Main {
    public static void main(String[] args) {
        PrepareDrink coffee = new PrepareCoffe("canela");
        PrepareDrink tea = new PrepareTea("mel");
        PrepareDrink hotChocolate = new PrepareHotChocolate("marshmallow");

        coffee.prepareDrink();
        System.out.println();
        tea.prepareDrink();
        System.out.println();
        hotChocolate.prepareDrink();


    }
}