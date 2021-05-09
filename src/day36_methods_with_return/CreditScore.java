package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
    checkEligible(750);
      //  System.out.println(checkEligible(711)); Error cannot print void method.
        System.out.println(getCreditScore());
        checkEligible(getCreditScore());
        System.out.println("score = "+getCreditScore());
                int score = getCreditScore();
        System.out.println("Score in Variable "+score);
    }
    public static void checkEligible(int creditScore){
        if(creditScore>=700){
            System.out.println("You are eligible for leasing this car");
        }else{
            System.out.println("sorry, you are not eligible for leasing this car");
            System.out.println();
        }
    }
    public static int getCreditScore(){
        return 800;
    }
}
