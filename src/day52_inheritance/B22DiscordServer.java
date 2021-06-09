package day52_inheritance;

import day52_inheritance.discordUsers.Admin;
import day52_inheritance.discordUsers.User;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 =new User();
        user1.setId(123457);
        user1.setName("Vlad");
        user1.setRole("Student");

        Admin admin = new Admin();
        admin.setId(123);
        admin.setRole("Admin");
        admin.setName("Murodil");
        System.out.println(user1);
        System.out.println(admin);


    }
}
