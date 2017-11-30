package number_1;

public class Teacher extends Person {
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
