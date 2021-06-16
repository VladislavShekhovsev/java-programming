package day54_abstraction;

public class school {
    public static void main(String[] args) {
       // Student student1 = new Student(); Error, abstract classes cannot be an object (nothing to run) cannot be instantiated
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
    }
}
