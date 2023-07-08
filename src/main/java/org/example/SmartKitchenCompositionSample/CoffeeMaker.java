package org.example.SmartKitchenCompositionSample;

public class CoffeeMaker {

    boolean hasWorkToDo;



    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void breeCoffee () {
        if (hasWorkToDo) {
            System.out.println("The coffee maker is brewing");
            hasWorkToDo = false;
        }
    }

}
