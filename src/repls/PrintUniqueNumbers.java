package repls;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        int [] numbers ={2, 5, 5, 6, 3, 6, 9, 34, 3};
        for (int i = 0; i <numbers.length; i++) {
            int count =0;
            for (int j = 0; j <numbers.length; j++) {
                if(numbers[i]==numbers[j]){
                    count++;
                }

            }
            if(count==1){ System.out.print(numbers[i]+" ");}

        }
    }
}
