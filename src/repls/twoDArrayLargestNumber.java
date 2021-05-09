package repls;

public class twoDArrayLargestNumber {
    public static void main(String[] args) {
        int[][] nums = { {1,4,3,5,7,8},
                        {7,8,9,43,10},
                        {8,7,12,15,2} };
        int biggest=nums[0][0];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {

                if(biggest<=nums[i][j]){
                    biggest=nums[i][j];
                }

            }
        }
        System.out.println(biggest);

    }
}
