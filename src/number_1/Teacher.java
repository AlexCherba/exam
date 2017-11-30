package number_1;

public class Teacher extends Person {
    private String subject;
    private int rating;

    public Teacher(String firstName, String lastName, String subject) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        rating = 1 + (int) Math.random() * 12;
    }

}
