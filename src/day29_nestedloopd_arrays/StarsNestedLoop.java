package day29_nestedloopd_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for(int star =1;star<=5;star++){

            for(int innerStars =1;innerStars<10;innerStars++){
                System.out.print("\uD83C\uDF1F");
            }
            System.out.println("\uD83C\uDF1F");

        }
        for(int outer =1;outer<=10;outer++){
            for(int inner = 1;inner<=outer;inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
