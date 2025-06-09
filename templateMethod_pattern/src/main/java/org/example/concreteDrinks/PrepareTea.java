package org.example.concreteDrinks;

import org.example.template.PrepareDrink;

public class PrepareTea extends PrepareDrink {

    public PrepareTea(String complement) {
        super(complement);
    }

    @Override
    protected void addIngredient() {
        System.out.println("Adicionando Cha");
    }

    @Override
    protected void addComplements(String complement) {
        System.out.println("Adicionando complemento: " + complement);

    }
}
