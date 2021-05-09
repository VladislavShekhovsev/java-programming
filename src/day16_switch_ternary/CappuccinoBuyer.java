package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        double price;
        double calories;
        String size = "tall";
        switch (size) {
            case "tall":
                price = 3.69;
                calories = 90;
                System.out.println("price of your drink: " + price + " and calories " + calories);
                break;
            case "grade":
                price = 3.99;
                calories = 120;
                System.out.println("price of your drink: " + price + " and calories " + calories);
                break;
            case "venti":
                price = 4.29;
                calories = 150;
                System.out.println("price of your drink: " + price + " and calories " + calories);
                break;
            default:
                System.out.println("wrong  chose ");
        }
    }
}
