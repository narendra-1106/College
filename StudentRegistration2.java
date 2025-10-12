interface Registration {
    void enterDetails();
    void confirmRegistration();
}

public class StudentRegistration2 implements Registration {
    public void enterDetails() {
        System.out.println("Name and roll number entered.");
    }

    public void confirmRegistration() {
        System.out.println("School student registration confirmed.");
    }

    public static void main(String[] args) {
        StudentRegistration2 s = new StudentRegistration2();
        s.enterDetails();
        s.confirmRegistration();
    }
}
