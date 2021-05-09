package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data={1, 3, 7, 8, 9, 12, 17, 33, 137, 333};//array its indexes here 10 numbers its indexes from 0-9
        for( int eachNum:data ) {
              System.out.println(eachNum);
        } for(int n : data){
                System.out.print(n+" ");
            }
        System.out.println();
         // repeat above with for loop
        System.out.println("----------------FOR---LOOP------------------");
        for(int i =0 ; i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        System.out.println(data[data.length-1]);
        // all numbers backwards in same line
        for (int idx = data.length-1;idx>=0;idx--){
            System.out.print(data[idx]+" ");
        }




    }
}
