package org.example.template;

public abstract class PrepareDrink {

    private String complement;

    public PrepareDrink(String complement) {
        this.complement = complement;
    }

    public final void prepareDrink() {
        System.out.println("=== Preparando bebida ===");
        boilWater();
        addIngredient();
        addComplements(complement);
        mix();
        serveDrink();
        System.out.println("=== Bebida pronta! ===");
    }

    private void boilWater() {
        System.out.println("Esquentando a água...");
    }

    private void mix() {
        System.out.println("Misturando bem...");
    }

    private void serveDrink() {
        System.out.println("Servindo na xícara");
    }

    // Métodos abstratos - cada bebida implementa do seu jeito
    protected abstract void  addIngredient();
    protected abstract void addComplements(String complement);
}
