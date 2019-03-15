package za.ac.cput.Assigment4.LiskovSubstitution.Bad;

public abstract class Computer {

    public String brand;
    public int processors = 2;
    public double speed;

    public String getBrand(String brnd)
    {
        this.brand = brnd;
        return brand;
    }

    public int getProcessors(int process)
    {
        this.processors = process;
        return processors;
    }

    public double getSpeed(double spd)
    {
        this.speed = spd;
        return speed;
    }

    public abstract void processSpeed(double speed);

}
