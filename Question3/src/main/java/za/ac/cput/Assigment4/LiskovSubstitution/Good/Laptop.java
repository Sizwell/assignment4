package za.ac.cput.Assigment4.LiskovSubstitution.Good;

public class Laptop {

    public int processors = 2;
    public double speed;

    public Laptop()
    {
        this.processors = 0;
    }

    public void increaseSpeed(double spd)
    {
        this.speed = spd;
    }

}
