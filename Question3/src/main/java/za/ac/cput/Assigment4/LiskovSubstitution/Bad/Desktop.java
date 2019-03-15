package za.ac.cput.Assigment4.LiskovSubstitution.Bad;

public class Desktop extends Computer{

    public Desktop()
    {
        this.processors = 4;
    }

    @Override
    public void processSpeed(double speed) {
        this.speed = speed;
    }
}
