package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
     Employee employee1 = new Employee();
     employee1.name = "jack";
     employee1.jobTitle = "SDET";
     employee1.age = 29;
     employee1.gender ='M';
     employee1.work();
     Employee employee2 = new Employee();
     employee2.name ="Samantha";
     employee2.jobTitle="Developer";
     employee2.age =35;
     employee2.gender='F';
     employee2.work();
     Employee employee3 = new Employee();
     employee3.name="Anna";
     employee3.age = 40;
     employee3.gender='F';
     employee3.jobTitle="Full stack developer";
     employee3.work();

    }
}
