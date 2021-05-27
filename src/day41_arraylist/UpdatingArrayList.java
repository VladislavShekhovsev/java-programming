package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class  UpdatingArrayList {
    public static void main(String[] args) {
        // List cars
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Nisan");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0,"Jeep");
        myCars.add(1,"Lada");
        myCars.add(2,"yugo");
        System.out.println(myCars);
        System.out.println(myCars.toString());// unnecessary to do here to String
        //store all cars in one String
        String AllCarsIn1Str=myCars.toString();
        System.out.println("All cars in one String = "+AllCarsIn1Str);
        //  changing index 0(not adding, changing like replace)
        myCars.set(0,"Lamborghini");  // .set is to replace the value under needed index, in our case its index 0 nut it can be any.
        System.out.println("after set "+myCars.toString());// do not have to be  to string we use it to remember the method
        // changing Mazda to honda
        myCars.set(4,"Honda");
        System.out.println(myCars);
        /** How would u do that if myCars was Array
         * myCArs[4]="Honda";
         */
        myCars.set(5,"Lexus");
        System.out.println(myCars.toString());
        // to find the index of "Tesla"
        System.out.println("index of Tesla "+myCars.indexOf("Tesla"));
        int moskvich = myCars.indexOf("Moskvich");
        System.out.println(moskvich);
        // to replace value by value we have to use indexOf in place of index of set method
        myCars.set(myCars.indexOf("Moskvich"),"Volga");
        System.out.println(myCars);
        // replace yugo with traban
        myCars.set(myCars.indexOf("yugo"),"Trabant");
        System.out.println(myCars);
        if(myCars.contains("Lada")){ // we are doing if statement if contains to prevent error outOfBounds error -1, if there is no Lada
            myCars.set(myCars.indexOf("Lada"),"Bugatti");
            System.out.println(myCars);;}else{
            System.out.println("lada not found");}
         /** changing Lamborghini for prius*/
         /**Toyota -> Audi*/
         for(int i =0;i<myCars.size();i++){
             if(myCars.get(i).equalsIgnoreCase("lamborghini")) {
                 myCars.set(i, "Prius");
             }else if(myCars.get(i).equals("Trabant")){
                 myCars.set(i,"BNW");
             }else if(myCars.get(i).equalsIgnoreCase("Nisan")){
                 myCars.set(i,"Audi");
             }
         }
        System.out.println("--------------------------------------");
        System.out.println(myCars);
    }
}

