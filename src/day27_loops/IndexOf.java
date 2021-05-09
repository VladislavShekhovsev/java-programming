package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter ='i';
        int index =-1;// creating the variable outside the loop to carry its value;

        for (int n =0;n<word.length();n++) {
            // System.out.println(n+" - "+word.charAt(n));
            if (word.charAt(n) == letter) {
                index = n;//assigning the value to index value to carry the value of n outside the loop
               // System.out.println(letter + " is founded index " + index);
                //break; will exit from loop and return; is more powerful it will exit the main method
                break;
            }
        }
            if(index==-1){
                System.out.println(letter+" is not present");
            } else{System.out.println(letter + " is founded index " + index);}
        //for this one need break at the end


    }
}
