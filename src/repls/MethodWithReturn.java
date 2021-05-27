package repls;

public class MethodWithReturn {
    public static void main(String[] args) {
     String[]words = {"love","hate","romance","despite","hate","love","hate"};
        System.out.println(countAppearance(words,"hate"));
    }
    public static int countAppearance(String[] arr,String t){
        int count=0;
        for (String each:
             arr) {
            if(each.equals(t)){
                count++;
            }
        }
        return count;
    }
}
