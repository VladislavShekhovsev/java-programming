package day32_arrays_split;
import java.util.Arrays;
public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println("find and print the most expensive item details");
        double MaxPrice = prices[0];
        double MinPrice= prices[0];
        int indexOfMaxPrice =0;
        int indexOfMinPrice =0;
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        for(int i=0;i<prices.length;i++){
            if(prices[i]>MaxPrice){
                MaxPrice=prices[i];
              indexOfMaxPrice=i;
            }
            if(MinPrice>prices[i]){
                MinPrice=prices[i];
                indexOfMinPrice=i;
            }

        }
        System.out.println("Max price: "+MaxPrice+" and its index is: "+indexOfMaxPrice);
        System.out.println("Min price: "+MinPrice+"and its index is: "+indexOfMinPrice);
        System.out.println("most expensive item "+items[indexOfMaxPrice]+", its id:"+itemIDs[indexOfMaxPrice]);
        System.out.println("most cheapest item "+items[indexOfMinPrice]+", its id:"+itemIDs[indexOfMinPrice]);
    }
}
