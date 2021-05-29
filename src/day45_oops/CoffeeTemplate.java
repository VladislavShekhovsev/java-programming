package day45_oops;

public class CoffeeTemplate {
    String typeOfCoffee;
    int amount;

    public void refill() {
        amount = 100;
    }

    public void drink(int amountYouDrink) {
        amount -= amountYouDrink;
    }

    public int getAmount() {

    return amount;}
    public void setType(String newType){
        typeOfCoffee=newType;
    }

    @Override
    public String toString() {
        return "CoffeeTemplate{" +
                "typeOfCoffee='" + typeOfCoffee + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getType(){

    return typeOfCoffee;}
}







