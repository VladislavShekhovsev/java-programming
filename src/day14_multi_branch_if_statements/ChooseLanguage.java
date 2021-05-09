package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        byte selectionOfLanguage = 4;
        if (selectionOfLanguage == 1) {
            System.out.println("Hello, thank for your call");
        } else if (selectionOfLanguage == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (selectionOfLanguage == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (selectionOfLanguage == 4) {
            System.out.println("Zdrastvuite, blagodarim vas za zvonok");
        } else if (selectionOfLanguage == 5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("lets tak java and english, hello.");
        }
    }
}
