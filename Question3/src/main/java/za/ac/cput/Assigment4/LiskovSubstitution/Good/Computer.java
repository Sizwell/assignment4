package za.ac.cput.Assigment4.LiskovSubstitution.Good;

public class Computer {
    public String brand;
    public int processors = 2;
    public double speed;

    public Computer()
    {
        this.speed = 5;
    }

    public void getBrand(String brnd)
    {
        this.brand = brnd;

    }


}
