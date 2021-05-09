package day15_logicalops_switch_ternary;

public class CarChooseOrLogic {
    public static void main(String[] args) {
        String model = ("Tesla");
        int budget = 5_000;
        int carPrice = 8_000;
        if (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla") && budget >= carPrice) {
            System.out.println("Ready to purchase "+model+" for $"+carPrice);
        } else {
            System.out.println("Not interesting in "+model+" for price $"+carPrice);
        }

    }
}
