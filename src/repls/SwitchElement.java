package repls;

import java.util.Arrays;

public class SwitchElement {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        System.out.println(Arrays.toString(do_switch(nums)));

    }
    public static int[]do_switch(int []i){
        int []temp=new int [i.length];
        for (int j = 0; j < i.length ; j++) {
            temp[j]=i[j];
            i[j]=i[i.length-1];
            i[i.length-1]=temp[j];
            break;
        }
        return i;
    }

}
