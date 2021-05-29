package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 =new Group("Cybertek");
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());
        Group group2 = new Group();
        group2.setGroupName("CyberDogs");
        group2.addMember("Pincher");
        System.out.println(group2);
        System.out.println(group1.getMembers().size());
        System.out.println(group1.getMembers());
        Group group3 =new Group("CyberCats");
        group3.setMembers(Arrays.asList("Andea","Nasim","Artem","lesha","katya","Anton"));
        System.out.println("group2 members: "+group2.getMembers());
        System.out.println("group3 members: "+group3.getMembers());
        if(group3.getMembers().contains("Anton")){
            System.out.println("Anton is a member of group3");
        }else {
            System.out.println("Anton is not member of group3");
        }
        System.out.println(group1.getMembers());
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1.getMembers());

    }
}
