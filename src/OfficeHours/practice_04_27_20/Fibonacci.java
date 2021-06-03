package OfficeHours.practice_04_27_20;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
     Fibonacci(8);
    }
    public static void Fibonacci(int num){
        int[] arr =new int[num+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i < arr.length ; i++) {
          arr[i]=  arr[i-1]+ arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
