package SelfPractice;
import java.util.*;
public class repl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int laptopPrice = 0, ramSize = 0, ramPrice = 0, ramCost = 0, storageAmount = 0, storageMath = 0, storagePrice = 0;
        double screenSize;
        String storage = "HDD", resolution = "FULLHD";
        String cpu = "i3", cpu2 = "i5", cpu3 = "i7";
        System.out.println("Select screen size:");
        screenSize = input.nextDouble();
        if (screenSize == 13.3) {
            laptopPrice += 200;

        } else if (screenSize == 15.0) {
            laptopPrice += 300;

        } else if (screenSize == 17.3) {
            laptopPrice += 400;
        }
        System.out.println("Select CPU type:");
        cpu = input.next();
        if (cpu.equalsIgnoreCase("i3")) {
            laptopPrice += 150;

        } else if (cpu2.equalsIgnoreCase("i5")) {
            laptopPrice += 250;
        } else if (cpu3.equalsIgnoreCase("i7")) {
            laptopPrice += 350;
        }
        System.out.println("Select RAM size:");
        ramSize = input.nextInt();
        ramPrice = ramSize / 4;
        ramCost = ramPrice * 50;
        laptopPrice += ramCost;
        System.out.println("Select storage type:");
        storage = input.next();
        if (storage.equalsIgnoreCase("HDD")) {
            System.out.println("Enter storage size:");
            storageAmount = input.nextInt();
            storageMath = storageAmount / 500;
            storagePrice = storageMath * 50;
            laptopPrice += storagePrice;
        } else {
            System.out.println("Enter storage size:");
            storageAmount = input.nextInt();
            storageMath = storageAmount / 500;
            storagePrice = storageMath * 100;
            laptopPrice += storagePrice;
        }
        System.out.println("Enter screen resolution:");
        resolution = input.next();
        if (resolution.equalsIgnoreCase("fullhd")) {
            laptopPrice += 100;
        } else {
            laptopPrice += 200;
        }
        System.out.print("Laptop price is: " + laptopPrice + "$");
    }

}