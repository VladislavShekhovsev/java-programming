package repls;

import java.util.Arrays;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "11:10:05PM";

        if (time.contains("PM")) {
            String newStr = time.substring(0, time.length() - 2);
            String[] arr = newStr.split(":");
            String v = "";
            int nums[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    nums[i] = Integer.parseInt(arr[i]) + 12;
                } else {
                    nums[i] = Integer.parseInt(arr[i]);
                }
                if (arr[0].equals("12")) {
                    nums[0] = 0;
                }

            }
            String zero = "000000";
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[nums.length - 1] && nums[i] == 0) {
                    v += nums[i] + "0";
                } else if (nums[i] == nums[nums.length - 1] && nums[i] < 10 && nums[i] > 0) {
                    v += "0" + nums[i];
                } else if (nums[i] == nums[nums.length - 1] && nums[i] > 10) {
                    v += nums[i];
                }
                if (nums[i] != nums[nums.length - 1] && nums[i] < 10 && nums[i] > 0) {
                    v += "0" + nums[i] + ":";
                } else if (nums[i] != nums[nums.length - 1]) {
                    v += nums[i] + ":";
                }


            }
            if(v.equals(zero)){
                System.out.println("00:00:00");
            }else{


                System.out.println(v);}
        } else if (time.contains("AM")) {
            String newStr = time.substring(0, time.length() - 2);
            String[] arr = newStr.split(":");
            String v = "";
            int nums[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (arr[0].equals("12")) {
                    nums[0] = 0;
                } else {
                    nums[i] = Integer.parseInt(arr[i]);
                }

            }
            String zero = "000000";
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[nums.length - 1] && nums[i] == 0) {
                    v += nums[i] + "0";
                } else if (nums[i] == nums[nums.length - 1] && nums[i] < 10 && nums[i] > 0) {
                    v += "0" + nums[i];
                } else if (nums[i] == nums[nums.length - 1] && nums[i] > 10) {
                    v += nums[i];
                }
                if (nums[i] != nums[nums.length - 1] && nums[i] < 10 && nums[i] > 0) {
                    v += "0" + nums[i] + ":";
                } else if (nums[i] != nums[nums.length - 1]) {
                    v += nums[i] + ":";
                }


            }
            if(v.equals(zero)){
                System.out.println("00:00:00");
            }else{


                System.out.println(v);}



        }

    }


}




    //  Integer.parseInt(newStr);
    //  System.out.println(newStr);

    /** int jjjj =00;
     System.out.println(jjjj);
     /** double kkkkkk = 55;
     System.out.println(kkkkkk);*/
    /**   System.out.println(Integer.parseInt(time.substring(0,time.length()-2)));
     // System.out.println(num);
     Integer newTime=Integer.parseInt(time.substring(0,time.length()-2));*/
    //nums[0]+=Integer.parseInt(arr[i])+12;

