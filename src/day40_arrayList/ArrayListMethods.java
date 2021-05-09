package day40_arrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = "+shoppingList.size());
        System.out.println("isEmpty? = "+shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }
        int count = shoppingList.size();
        System.out.println("items to buy = "+count);
        System.out.println("is shoes in my list ? "+shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("good i didnt forget to buy them");
        }else{
            System.out.println("add shoes to the shopping list");
        }
        System.out.println("buying shoes...$80");
        shoppingList.remove("shoes");
        System.out.println(shoppingList);
        /**while remove only numbers need new Integer, double, float etc to clarify its not index
         * String dont need new String("shoes"), only numbers to not confuse with index*/
         shoppingList.clear();//clear all the ArrayList
        System.out.println(shoppingList);// now its empty



    }
}
