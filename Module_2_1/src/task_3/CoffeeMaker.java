package task_3;

public class CoffeeMaker {
    private String coffeeType;
    private int coffeeAmount;
    private boolean isOn = false;

    public void setCoffeeType (String type) {
        switch (type){
            case "espresso":
                coffeeType = "espresso";
                break;
            case "normal":
                coffeeType = "normal";
                break;
            default:
                break;
        }
    }
    public String getCoffeeType(){
        return coffeeType;
    }
    public void setCoffeeAmount (int amount) {
        if (amount < 10) {
            coffeeAmount = 10;
        } else if (amount > 80) {
            coffeeAmount = 80;
        } else {
            coffeeAmount = amount;
        }
    }
    public int getCoffeeAmount() {
        return coffeeAmount;
    }
    public void pressOnOff() {
        isOn = !isOn;
    }
    public boolean isOn () {
        return isOn;
    }
}
