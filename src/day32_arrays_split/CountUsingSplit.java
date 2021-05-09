package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats=" bengal cat tabby cat persian cat van cat ";
        int count =0;
        for(int i =0;i<cats.length()-2;i++){
            if(cats.substring(i,i+3).equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println("count of cats in the string "+count);
        String[] catsArray = cats.split("cat");
        System.out.println("number of cats = "+(catsArray.length-1));

    }
}
