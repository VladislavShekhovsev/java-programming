package day18_conditions_practice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int lastSSN = 606037;
        int pinCode = 13457;
        int expLast4SSN = 6;
        int expPinCode = 1;
        if (lastSSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("authentication successful");
        } else {
            System.out.println("authentication unsuccessful");

            if (expLast4SSN != lastSSN) {

                System.out.println("ssn not match");
            }
            if (expPinCode != pinCode) {

                System.out.println("pin dont mach");
            }
        }
        }
    }

