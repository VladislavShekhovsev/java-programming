package repls;

public class ReplFindSumOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};
        int count = 0;
        for (int each : arr) {
            count += each;
        }
        System.out.println(count);
    }
}

