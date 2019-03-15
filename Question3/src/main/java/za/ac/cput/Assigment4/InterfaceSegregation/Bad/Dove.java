package za.ac.cput.Assigment4.InterfaceSegregation.Bad;

public class Dove implements Bird{

    public String position;
    public int numberOfEyes;

    public Dove(int numOfEyes) {
        this.numberOfEyes = numOfEyes;
    }


    @Override
    public void fly() {
        this.position = "I'm airborne";
    }
}
