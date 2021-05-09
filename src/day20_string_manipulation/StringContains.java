package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String fullName = "Vladislav";
        if (fullName.contains("Vlad")) {
            System.out.println("its true");
            System.out.println(fullName.contains("V"));
            System.out.println(fullName.contains("la"));
        }
        String companyName = "Capital one";
        System.out.println(companyName.contains(" "));
        if (companyName.contains(" ")) {
            System.out.println("the company name combined from couple words");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        //check if " | " is in etsyTitle;
        if (etsyTitle.contains(" | ")) {
            System.out.println("it is contain the spaces ");
        } else {
            System.out.println("dont contain");
        }
        String firstName = "Vladislav";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("its can be Vladislav and its can be Va...");
        }
        String mail = ("Vladislav13457@gmail.com");
        if (mail.contains("@") && mail.endsWith(".com")) {
            System.out.println("its a valid email");
        } else {
            System.out.println("its invalid mail");
        }
        if (mail.toLowerCase().contains("d")) {
            System.out.println("its have d and its no Capital sensitive sensitive");
        }
        String company = "zvezda";
        System.out.println(company);
        System.out.println(company.replace("zve", "pi"));
        System.out.println(company);
        String java = "java strings are fun";
        System.out.println(java.replace("java ", ""));
    }
}

