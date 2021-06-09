package OfficeHours.Practice_06_15_21;

public class EmailObject {
    public static void main(String[] args) {

        /* Without static String variable in each class
        Email email = new Email("Anthon@cybertekschool.com", 43);
        System.out.println(email);
        //email.ADDRESS="email"; error: it's final, cannot be changed
        System.out.println(Email.domain);// only one static variable but it have excess from  3 classes(if static changed its changed everywhere)
        System.out.println(Gmail.domain);
        System.out.println();

        Gmail gmail = new Gmail("Kamran@gmail.com",133);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);

        Yahoo yahoo = new Yahoo("yahoo@yahoo.com",12);// will ran only one time when class loaded, next object would not run the static
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);*/

        Email email = new Email("Anthon@cybertekschool.com", 43);
        System.out.println(email);
        //email.ADDRESS="email"; error: it's final, cannot be changed
        System.out.println(Email.domain);// only one static variable but it have excess from  3 classes(if static changed its changed everywhere)
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Gmail gmail = new Gmail("Kamran@gmail.com",133);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("yahoo@yahoo.com",12);// will ran only one time when class loaded, next object would not run the static
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        //With static String inside each class, its called hiding the variables(hiding the ones in other classes, that noe related)

        Gmail.sendEmail();
        Email.sendEmail();
        Gmail.sendSuperEmail();//both exist, child can excess to static of parents



    }

}
