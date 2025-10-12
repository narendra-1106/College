abstract class Student {
    abstract void register();
    void display() {
        System.out.println("Student registration process started.");
    }
}

public class StudentRegistration1 extends Student {
    void register() {
        System.out.println("College student registered successfully.");
    }

    void courseSelection() {
        System.out.println("Course selected: Computer Engineering");
    }

    public static void main(String[] args) {
        StudentRegistration1 s = new StudentRegistration1();
        s.display();
        s.register();
        s.courseSelection();
    }
}
