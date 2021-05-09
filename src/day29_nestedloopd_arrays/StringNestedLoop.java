package day29_nestedloopd_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String name = "Vladislav";
        //find duplicates
        // find unique characters
        //print character and number of occurrences
        for(int i=0;i<name.length();i++){
            //System.out.println(name.charAt(i));
            for(int j=0;j<=i;j++){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }

        for(int i =0;i<name.length();i++){
            for(int j = i;j< name.length();j++){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }


    }
}
