package OfficeHours;

public class PrimeNumbers {
    public static void main(String[] args){
        int number = 50;

        // 5/2, 5/3, 5/4

        for(int j = 2; j <= number; j++) {
            boolean isPrime = true;
             int eachNUmber =j;

            for(int i = 2; i < eachNUmber; i++){
                if(eachNUmber % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(eachNUmber  + " ");
            }

        }
    }
}