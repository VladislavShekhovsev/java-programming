package saim_HomeWork.practice_06_01_2021;

public class Developer {
        private String name;
        private  int employeeID;
        private String jobTitle;
        private double salary;
        private static boolean hasCodingSkills =true;
        //static, now its not belong to object its belong to class so its gonna be in all objects same value

        public Developer(String name, int employeeID,String jobTitle,double salary){
            this. name = name;
            this.employeeID =employeeID;
            this.jobTitle =jobTitle;
            this.salary =salary;
        }
        public void coding(){
            System.out.println(this.name+" is coding");
        }
        public void fixingBud(){
            System.out.println(this.name+" fixing bug");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean HasCodingSkills() {
        return hasCodingSkills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}





















        /*[Scrum Team]

* Encapsulate each class

- create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, smokeTesting(),  creatingTicket(), toString()

            -> Optional: static variable

----------------------------------------------------------------
- create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        hasCodingSkills

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, coding(),  fixingBug(), toString()

----------------------------------------------------------------
- create a class called ScrumTeam

               Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            hasSprint, hasMeeting

                Constructor:
                      sets the names of: PO, BA, SM

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name*/