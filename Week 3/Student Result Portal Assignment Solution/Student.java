package studentresultportal;

public class Student {
    String name;
    int attendance;   // in percent, e.g. 90
    int marks;

    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }
}