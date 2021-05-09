package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";

        String drink1 = "coke";
        String snack1 = "chips";
        System.out.println("");
        if (selection.equals("drink")) {
            if (drink1.equals("coke")) {
                System.out.println("coke is selected");

            } else {
                System.out.println("Sweet tea selected");
            }
        } else if (selection.equals("snack")) {
            if (snack1.equals("chips")) {
                System.out.println("chips selected");
            } else {
                System.out.println("candy selected");
            }
        }
    }
}

