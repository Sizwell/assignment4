package za.ac.cput.Assigment4.InterfaceSegregation.Good;

public class Dove implements FlyingBirds, BirdEyes {

    public String position;
    public int numberOfEyes;

    public Dove(int numOfEyes) {
        this.numberOfEyes = numOfEyes;
    }


    @Override
    public void fly() {
        this.position = "I'm in the air";
    }


    @Override
    public void eyes() {
        this.numberOfEyes = 2;
    }
}
