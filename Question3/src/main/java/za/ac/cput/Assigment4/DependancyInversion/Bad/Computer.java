package za.ac.cput.Assigment4.DependancyInversion.Bad;

public class Computer {

    public String generateVirusAlert(String virus) {
        String alert = "Affected by " + virus;
        return alert;
    }
}
