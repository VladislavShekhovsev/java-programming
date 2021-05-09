package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class lessonWord {
    public static void main(String[] args) {
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordWithA = "";// use it to carry ur value
        if(wordOne.contains("a")&&wordOne.length()>biggestWordWithA.length()){
            biggestWordWithA =wordOne;}
            if(wordTwo.contains("a")&&wordTwo.length()>biggestWordWithA.length()){
                biggestWordWithA = wordTwo;
             }
              if(wordThree.contains("a")&&wordThree.length()>biggestWordWithA.length()){

              biggestWordWithA = wordThree;}
                System.out.println(biggestWordWithA+" are longest world with A");
    }
}
