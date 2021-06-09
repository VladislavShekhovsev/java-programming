package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle="Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualSalary = developer.calculateSalary(60.0);
        System.out.println("annualSalary = " +Math.round(annualSalary));

        Contractor sdetContractor=new Contractor();
        sdetContractor.jobTitle="SDET";
        double sdetSalary = sdetContractor.calculateSalary(65);
        System.out.println("sdet salary = "+sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor.toString());
    }
}
