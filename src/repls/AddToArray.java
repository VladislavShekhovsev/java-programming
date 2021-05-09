package repls;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }
       add_to_r(arr,n);


    }
  /**  public static void add_to_r(int[]r,int n){
        int []nr =new int[r.length+1];
        for (int i = 0; i <r.length ; i++) {
            nr[i]=r[i];
        }
          nr[r.length]=n;
        System.out.println(Arrays.toString(nr));
    }*/
  public static void add_to_r(int[]r,int n){
      int []nr =new int[r.length+1];
      for (int i = 0; i <nr.length ; i++) {
         if(i<nr.length-1){ nr[i]=r[i];}
         if(i==nr.length-1){nr[r.length]=n;}
      }
      System.out.println(Arrays.toString(nr));

      }


}
