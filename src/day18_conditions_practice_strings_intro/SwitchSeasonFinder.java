package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
//if in if. if(month==1||month==12||month==2){System.out.println("Winter")}
        int month = 6;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
        }
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
        }
        switch (month) {
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
        }
        switch (month) {
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
        }
        }
    }

