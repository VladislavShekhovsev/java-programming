package day50_inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID =1234;
        t1.name="Saim";
        t1.age=25;
        t1.talk();

        Student stu1 = new Student();
        stu1.name="Vald";
        stu1.school="Cybertek";
        stu1.age=32;
        stu1.grade=100;
        stu1.isActive=true;
        stu1.talk();
        stu1.work("Chiropractic assistant");
        stu1.studentId="asdf1234";
        stu1.study();
    }
}
