package org.example.SmartKitchenCompositionSample;

public class DishWasher {

    private boolean hasWorkToDo;



    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes () {
        if (hasWorkToDo == true) {
            System.out.println("the dish washer is washing");
            hasWorkToDo=false;
        }
    }
}
