package day35_method_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(100);
        int num =137;
        count(num);
        String word ="Wooden spoon";
        count(word.length()); // also work, its count length (length its integer)
        printAge(32);
    }
    public static void count(int num){
        for(int i =1;i<=num;i++){

            System.out.print(i+" ");

        }
        System.out.println();
    }
    public static void printAge(int num){
        int year=2021;
        System.out.println("Birth date:"+(year-num)+". Age: "+num);
        System.out.println();
    }

}
