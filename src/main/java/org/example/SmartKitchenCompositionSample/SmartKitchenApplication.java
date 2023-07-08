package org.example.SmartKitchenCompositionSample;

public class SmartKitchenApplication {

    private CoffeeMaker brewMaster;
    private Refrigerator reefer;
    private DishWasher washer;

    public SmartKitchenApplication() {

        brewMaster = new CoffeeMaker();
        reefer = new Refrigerator();
        washer = new DishWasher();

    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getReefer() {
        return reefer;
    }

    public DishWasher getWasher() {
        return washer;
    }

    public void setKitchenState (boolean reeferFlag, boolean coffeeMakerFlag, boolean dishWasherFlag) {
        reefer.setHasWorkToDo(reeferFlag);
        brewMaster.setHasWorkToDo(coffeeMakerFlag);
        washer.setHasWorkToDo(dishWasherFlag);

    }

    public void doKitchenWork () {
        reefer.orderFood();
        washer.doDishes();
        brewMaster.breeCoffee();
    }

    public static void main(String[] args) {

        SmartKitchenApplication kitchen = new SmartKitchenApplication();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();

    }
}
