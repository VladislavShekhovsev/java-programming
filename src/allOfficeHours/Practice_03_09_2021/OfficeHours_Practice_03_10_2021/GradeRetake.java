package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class GradeRetake {
    public static void main(String[] args) {
        int baseGrade =90;
        int numberOfAttempts= 1;
        int retakePenalty =0;
        if( numberOfAttempts==1){retakePenalty=(int)(baseGrade*.10);}
        if(numberOfAttempts==2){retakePenalty=(int)(baseGrade*.2);}
        if(numberOfAttempts==3){retakePenalty=(int)(baseGrade*.3);}
        System.out.println("Grade after retake attempt "+numberOfAttempts+" gonna be "+retakePenalty);


    }
}
