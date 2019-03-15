package za.ac.cput.Assigment4.DependancyInversion.Bad;

public class Weather {

    public String currentConditions;
    Computer comp;
    Email email;

    public Weather() {
        comp = new Computer();
        email = new Email();
    }

    public void setVirusDefinitions(String definition) {
        this.currentConditions = definition;
        if (definition.equals("Boot sector")) {
            String alert = comp.generateVirusAlert(definition);
            System.out.print(alert);
        }
        if (definition.equals("Spam")) {
            String alert = email.generateEmails(definition);
            System.out.print(alert);
        }
    }

}
