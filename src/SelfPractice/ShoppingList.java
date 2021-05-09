package SelfPractice;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        String item3 = scan.next();
        double price3 = scan.nextDouble();
        String report = scan.next();
        double totalPrice = (price1+price2+price3);
        System.out.println("item: "+item1+" price: "+price1+", item2: "+item2+" price: "+price2+", item3: "+
                item3+" price: "+price3);
        System.out.println("Total price:"+totalPrice);


    }
}
