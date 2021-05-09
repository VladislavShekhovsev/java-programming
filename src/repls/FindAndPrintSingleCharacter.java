package repls;

public class FindAndPrintSingleCharacter {
    public static void main(String[] args) {
        int [] nums = {1, 1, 2, 3, 4, 3, 4};
        for (int i =0;i<nums.length;i++){
            for(int n =0;n<=i;n++){
                if(nums[i]==nums[n]){
                    System.out.println(n);
                }
            }
        }

    }

}
