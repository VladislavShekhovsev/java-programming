package SelfPractice.parctice05_29_21;

import java.util.ArrayList;
import java.util.Arrays;

public class Flight {
    public static void main(String[] args) {
        PlainTemp flight1 = new PlainTemp("NV123","Vlad",123,true);
        flight1.setPassengers(new ArrayList<>(Arrays.asList("Maria","Nasiba","Rita")));
        System.out.println(flight1.getPassengers());
        System.out.println(flight1);


    }
}
