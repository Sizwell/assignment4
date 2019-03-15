package za.ac.cput.Assigment4.DependancyInversion.Bad;

public class Email {

    public String generateEmails(String emails) {
        String alert = "It is " + emails;
        return alert;
    }
}
