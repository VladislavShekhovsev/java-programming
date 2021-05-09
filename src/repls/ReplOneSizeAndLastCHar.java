package repls;
/*public class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int size = scan.nextInt();
  int[] nums = new int[size];
  for (int i = 0; i < size; i++) {
    nums[i] = scan.nextInt();
  }

  int[] num = new int[size2];

  num [num.length - 1] = nums [nums.length-1];
  System.out.println(Arrays.toString(num));*/


import java.util.Arrays;

public class ReplOneSizeAndLastCHar {
    public static void main(String[] args) {

        int[]nums = new int[3];
        nums[0]=2;
        nums[1]=3;
        nums[2]=4;
        int [] num = new int [nums.length*2];
        num[num.length-1]=nums[nums.length-1];
       // num[num.length-2]=nums[nums.length-2];
        System.out.println(Arrays.toString(num));


    }
}
