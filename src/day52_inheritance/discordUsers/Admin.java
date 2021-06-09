package day52_inheritance.discordUsers;

public class Admin extends User{
    public Admin(){
        super();// call super class, no args constructor
        System.out.println("Admin class constructor");
    }
    public Admin(String id, String name ){
       // super("Admin",id,name);
        System.out.println("Admin class 2 args constructor");
    }
    @Override
    public String toString(){

        return "User{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
