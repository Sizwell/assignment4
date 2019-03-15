package za.ac.cput.Assigment4.LiskovSubstitution.Bad;

public class Laptop extends Computer{

    public Laptop()
    {
        this.processors = 2;
    }

    @Override
    public void processSpeed(double speed)
    {
        this.speed = speed;
    }
}
