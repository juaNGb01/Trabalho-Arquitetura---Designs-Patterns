package org.example.concreteDrinks;

import org.example.template.PrepareDrink;

public class PrepareCoffe extends PrepareDrink {

    public PrepareCoffe(String complement) {
        super(complement);
    }

    @Override
    protected void addIngredient() {
        System.out.println("Adicionando Café");
    }

    @Override
    protected void addComplements(String complement) {
        System.out.println("Adicionando complemento: " + complement);
    }
}
