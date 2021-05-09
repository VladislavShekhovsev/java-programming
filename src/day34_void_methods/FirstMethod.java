package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
     displayMessage();//call the method
        displayMessage();
        displayMessage();
        displayMessage();
        for(int i =0; i<=100;i++){
            displayMessage();
        }
    }

    // first custom reusable method
    public static void displayMessage(){
        System.out.println("Hello B22 Friends!");
    }
}
