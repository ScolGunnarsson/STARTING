package org.example.SmartKitchenCompositionSample;

public class Refrigerator {

    boolean hasWorkToDo;



    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood () {
        if (hasWorkToDo) {
            System.out.println("The reefer is providing");
            hasWorkToDo = false;
        }
    }
}
