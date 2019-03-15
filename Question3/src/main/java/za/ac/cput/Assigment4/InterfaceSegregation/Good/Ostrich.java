package za.ac.cput.Assigment4.InterfaceSegregation.Good;

public class Ostrich implements FlyingBirds, RunningBird{

    public String position;
    public int numberOfEyes;

    public Ostrich(int numOfEyes)
    {
        this.numberOfEyes = numOfEyes;
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    public void run()
    {
        this.position = "In open land";
    }


}
