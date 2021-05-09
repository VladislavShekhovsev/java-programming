package repls;

public class JavaAndPythonInString {
    public static void main(String[] args) {
        String str ="lala is a python -platform language java";
        int count1 =0;
        int count2=0;
        for(int i =0;i<=str.length()-6;i++){

                  if(str.substring(i,i+6).equals("python")){
                      count1++;}
                      if(str.substring(i,i+4).contains("java")){
                          count2++;
                      }
            }
        System.out.println(count1==count2);
        }
    }

