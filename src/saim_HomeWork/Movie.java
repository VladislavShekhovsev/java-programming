package saim_HomeWork;

public class Movie {
    public static void main(String [] args){
        String movieName = "Raya and the Last Dragon";
        String genre = "Fantasy";
        String duration = ("117m.");
        String releaseDate = "03/05/2021";
        String rating = "PG";
        boolean sequel = false;
        byte rottenTomatoes = 96;
        boolean DVD = false;
        System.out.println("Tonight we are streaming "+movieName+" with was released on "+releaseDate+"." );
        System.out.println("This "+genre+" movie got a "+rottenTomatoes+" rating on Rotten Tomatoes.");
        System.out.println("The rating is "+rating+" and its runs for "+duration);
        System.out.println("Would be released on DVD?: "+DVD+".");

    }
}
