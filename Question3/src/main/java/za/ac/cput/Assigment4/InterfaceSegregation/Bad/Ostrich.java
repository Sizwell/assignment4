package za.ac.cput.Assigment4.InterfaceSegregation.Bad;

public class Ostrich implements Bird{

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
