package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("wooden spoons "+count);
        // add value(increase count by 2
        count = count+2;
        System.out.println("wooden spoons "+ count);
        int apples = 5;
        System.out.println("apples: "+apples);
        apples= apples+10;
        System.out.println("apples: "+apples);
        apples = apples- 3;
        System.out.println("apples: "+apples);
        int pizzaSlices = 8;
        System.out.println("Pizza slices left "+pizzaSlices);
        pizzaSlices=pizzaSlices/2;
        System.out.println("Pizza slices left "+pizzaSlices);
        pizzaSlices=pizzaSlices+6;
        System.out.println("Pizza slices left "+pizzaSlices);
        int players = 10;
        System.out.println("Players: ");
        players = players *2;// double players to start match.
        System.out.println("players= "+players);
        int cents = 244;
        System.out.println("cents"+cents);
        cents =cents%100;// to keep only cents and give ll dollar 244/100cents ( dollar)=2
        // dollar u give and leave only cents 44
        System.out.println("cents"+cents);


    }
}
