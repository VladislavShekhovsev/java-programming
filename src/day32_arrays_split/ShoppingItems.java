package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        // index             0       1          2        3         4        5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println("FIND THE INDEX OF 'gloves' in item array");
        // use for loop with condition
        for (int i =0; i <items.length;i++){
          //  System.out.println(i+" - "+items[i]);
            if(items[i].equals("Gloves")){
                System.out.println(items[i]+" found in index "+i);
                break;
            }
        }
        boolean ifFound =false;
        for(String item: items){
            if(item.equalsIgnoreCase("iPad")){
                ifFound=true;
                break;
            }
        }
        System.out.println(ifFound);
        if(ifFound){
            System.out.println("we bought the iPad!");
        }else{
            System.out.println("we forgot the iPad");
        }
        System.out.println("Print a report of each item");
        for(int b =0;b<items.length;b++){
            System.out.println("item description: "+items[b]+", item price: $"+prices[b]+", item id: "+itemIDs[b]);
        }
        System.out.println("Look for 'Jacket' in items and print it");
        for(int c = 0;c<items.length;c++){
            if(items[c].equalsIgnoreCase("jacket")){
                System.out.println("item: "+items[c]+", price: "+prices[c]+", item id: "+itemIDs[c]);
                break;
            }
        }

    }
}
