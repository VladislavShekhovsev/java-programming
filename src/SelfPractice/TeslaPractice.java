package SelfPractice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TeslaPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to tesla");
        System.out.println("please type the model name to choose one of our vehicle models");
        System.out.println("model s\nmodel 3\nmodel x\nmodel y");
        String modelType = input.nextLine();
        if (modelType.equals("model s")) {
            System.out.println("please select one of the options");
            System.out.println("long range\nplaid\nplaid+");
            String typeClass = input.nextLine();
            if (typeClass.equals("long range")) {
                System.out.println("this awesome vehicle cost: $74,490,\n" +
                        "Range of single charge 412mi\n" +
                        "speed: up to 155mph\n" +
                        "take 3.1sec to 0-60mph ");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }
                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }

            } else if (typeClass.equals("plaid")) {
                System.out.println("This awesome vehicle cost: $114,490" +
                        "\nRange of single charge 390mi\n" +
                        "speed: up to 200mph\n" +
                        "take 1.99sec to 0-60mph");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }


                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }


            } else if (typeClass.equals("plaid+")) {
                System.out.println("this awesome vehicle cost: $144,490,\n" +
                        "Range of single charge 520mi\n" +
                        "speed: up to 200mph\n" +
                        "take <1.99sec to 0-60mph ");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }
                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }


            }
        } else if (modelType.equals("model 3")) {
            System.out.println("please select one of the options");
            System.out.println("standard range plus\nlong range\nperformance");
            String typeClass = input.nextLine();
            if (typeClass.equals("standard range plus")) {
                System.out.println("this awesome vehicle cost: $33,190,\n" +
                        "Range of single charge 263mi\n" +
                        "speed: up to 140mph\n" +
                        "take 5.3sec to 0-60mph ");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }
                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }

            } else if (typeClass.equals("long range")) {
                System.out.println("This awesome vehicle cost: $42,190" +
                        "\nRange of single charge 353mi\n" +
                        "speed: up to 145mph\n" +
                        "take 4.2sec to 0-60mph");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }


                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }


            } else if (typeClass.equals("performance")) {
                System.out.println("this awesome vehicle cost: $51,690,\n" +
                        "Range of single charge 315mi\n" +
                        "speed: up to 162mph\n" +
                        "take 3.1sec to 0-60mph ");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }
                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }


            }


        } else if (modelType.equals("model x")) {
            System.out.println("please select one of the options");
            System.out.println("long range\nplaid");
            String typeClass = input.nextLine();
            if (typeClass.equals("long range")) {
                System.out.println("this awesome vehicle cost: $84,690,\n" +
                        "Range of single charge 360mi\n" +
                        "speed: up to 155mph\n" +
                        "take 3.8sec to 0-60mph ");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }
                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }

            } else if (typeClass.equals("plaid")) {
                System.out.println("This awesome vehicle cost: $114,690" +
                        "\nRange of single charge 340mi\n" +
                        "speed: up to 163mph\n" +
                        "take 2.5sec to 0-60mph");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }


                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }


            }


        } else if (modelType.equals("model y")) {
            System.out.println("please select one of the options");
            System.out.println("long range\nperformance");
            String typeClass = input.nextLine();
            if (typeClass.equals("long range")) {
                System.out.println("this awesome vehicle cost: $45,690,\n" +
                        "Range of single charge 326mi\n" +
                        "speed: up to 135mph\n" +
                        "take 4.8sec to 0-60mph ");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }
                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }

            } else if (typeClass.equals("performance")) {
                System.out.println("This awesome vehicle cost: $56,690" +
                        "\nRange of single charge 303mi\n" +
                        "speed: up to 155mph\n" +
                        "take 3.5sec to 0-60mph");
                System.out.println("are you ready to purchase this awesome vehicle?  ");
                System.out.println("please type: yes/no");
                String buyIt = input.next();
                if (buyIt.equals("yes")) {
                    System.out.println("cash or credit pls?");
                    String paymentType = input.next();
                    if (paymentType.equals("cash")) {
                        System.out.println("thank you for purchase");
                    } else if (paymentType.equals("credit")) {
                        System.out.println("your credit card approved, thank you for purchase");
                    } else {
                        System.out.println("error");
                    }


                }else if(buyIt.equals("no")){
                    System.out.println("pls go back to main menu ");
                }
            }
        }else{
            System.out.println("you typed wrong model name, please choose one of those:model s\nmodel 3\nmodel x\nmodel y");
        }
    }

}