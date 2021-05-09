package repls;

public class FindHi {
    public static void main(String[] args) {
        String str="abc hi how hi";
        int count =0;
        for(int i =0;i<str.length()-1;i++){
               if (str.substring(i,i+2).contains("hi")){
                    count++;

            }

        }
        System.out.println(count);
    }
}
