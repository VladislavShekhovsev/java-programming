package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(9.3);
        instagram.useTheApp(20);
        instagram.download();

        Discord b22Discord =new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(7.3);
        b22Discord.useTheApp(100);
        b22Discord.download();
        System.out.println(b22Discord.printInfo());

    }
}
