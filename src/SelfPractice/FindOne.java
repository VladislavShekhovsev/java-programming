package SelfPractice;

public class FindOne {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4,5, 3, 15,6,8 ,4};
      int count =0;
      int fuf = 0;
        for (int i = 0;i<nums.length ; i++) {
            count=0;
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    count++;//1
                }
            }
            if(count==1){
                fuf++;
                System.out.println(nums[i]);
            }

        }
        System.out.println(fuf);


    }
}
