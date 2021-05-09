package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};
         for( char i:letters ){
             System.out.print(i+" ");


         }
        System.out.println();
        String sentence = new String(letters);// converting array CharAt to String
        System.out.println("sentence = "+sentence);
        String item ="wooden spoon";
        char[] itemArray = item.toCharArray();
        for(char n:itemArray ){
            System.out.print(n);
            System.out.println("- Array length"+itemArray.length);
            System.out.println("Method of String length"+item.length());
        }
        System.out.println();
        String [] fruits ={"bananas", "apples", "kiwi","mango","papaya","starwberry"};
        String fruitStr="";
        String fruitStrTrim="";
        for(String n:fruits){
            System.out.print(n+"-");
            fruitStr+=n+"-";
             fruitStrTrim =(fruitStr.substring(0,fruitStr.length()-1));
        }
        System.out.println("\nfruitsStr = "+fruitStrTrim);
        String [] languages ={"c++", "ruby", "java","javascript","python","c++"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("<>",languages));
        System.out.println(String.join("##",languages));
        String joinedlanguages =String.join(" & ",languages);
        System.out.println(joinedlanguages);

    }
}
