package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arrayList alt+enter to import the array list
        ArrayList<String> cities= new ArrayList<>();
        // add values (add cities)
        cities.add("Washington, DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Odessa");
        cities.add("LA");
        //Add ashhabat to first index
        // just choose the add method with 2 parameters (first one index position, and second is the value u want to add)
        cities.add(0,"Ashhabad");
        System.out.println(cities);
        // print the last city
        System.out.println("First city = "+cities.get(0));
        System.out.println("last city = "+cities.get(5));
        // find last city using size()-1.
        System.out.println("LAst city = "+cities.get(cities.size()-1));
        System.out.println("size of array = " +cities.size());// . size to find size
        int size =cities.size(); // creating variable with value of size
        System.out.println("there are "+size+" cities in array list");
        for(int i = 0; i < cities.size()/2;i++){
            System.out.print(cities.get(i)+ " ");
        }
        System.out.println();
        for(String each:cities){
            System.out.print(each+" ");
        }
        System.out.println();
        // how to delete item from arraylist
        // remove using index
        cities.remove(3);// removing Vienna
        System.out.println(cities);
        // remove using object/value
        cities.remove("New York");
        System.out.println(cities);
        // to remove everything we use .clear
        cities.clear();
        // to make sure if its empty 2 ways
        // print it\spit it
        System.out.println(cities);
        //second way is to use is empty method
        System.out.println(cities.isEmpty());
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }
        if(cities.size()==0){
            System.out.println("list is empty");
        }


    }
}
