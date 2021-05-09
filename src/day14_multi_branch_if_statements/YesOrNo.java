package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete thiss code?");
        char selection = 'y';
        boolean answer;
        String result;
        if (selection == 'y') {
            System.out.println("Your file will be deleted");
            answer = true; result="Deleted";
        } else {
            System.out.println("File deletion cancelled");
            answer = false; result="not Deleted;";}
            System.out.println("Did file get deleted ? " + answer);
            System.out.println(result);



    }
}
