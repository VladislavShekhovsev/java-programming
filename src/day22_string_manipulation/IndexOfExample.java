package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is in the index; "+indexOfJava);
        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index "+idxOfCss);
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index: "+indexOfCucumber);
        if(technologies.indexOf("maven")>1){
            System.out.println("maven inside ");
        }else{
            System.out.println(" no maven");
        }
    }
}
