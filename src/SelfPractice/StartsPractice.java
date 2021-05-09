package SelfPractice;
import java.util.Scanner;
public class StartsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter person");
        String starts = input.nextLine();
        if(starts.startsWith("Mr")){
            System.out.println("its man");
        }else if(starts.startsWith("Dr")){
            System.out.println("its a doctor");
        }else if(starts.startsWith("Mrs")){
            System.out.println("its a married woman");
        }else if(starts.startsWith("Ms")){
            System.out.println("its a single woman");
        }else if(starts.endsWith("Sr")){
            System.out.println("its a senior");}
            System.out.println("enter website");
            String ends = input.nextLine();
            if(ends.endsWith("com")){
                System.out.println("its US website");
            }else if(ends.endsWith("ru")){
                System.out.println("its a Russian website");
            }else if(ends.endsWith("gov")){
                System.out.println("its a government website");
            }else if(ends.endsWith("edu")){
                System.out.println("its educational website");
            }else if(ends.endsWith("org")){
                System.out.println("its organization website");
            }
        }
    }

