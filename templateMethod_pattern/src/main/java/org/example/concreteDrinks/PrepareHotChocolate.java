package org.example.concreteDrinks;

import org.example.template.PrepareDrink;

public class PrepareHotChocolate extends PrepareDrink {

    public PrepareHotChocolate(String complement) {
        super(complement);
    }

    @Override
    protected void addIngredient() {
        System.out.println("Adicionando chocolate");
    }

    @Override
    protected void addComplements(String complement) {
        System.out.println("Adicionando complemento: " + complement);

    }
}
