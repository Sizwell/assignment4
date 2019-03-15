package za.ac.cput.Assigment4;

public class Bicycle {

    private int gear;
    private int speed;


    public Bicycle(int gr, int spd)
    {
        this.gear = gr;
        this.speed = spd;
    }

    public int breakDown(int decrement)
    {
        speed -= decrement;
        return decrement;
    }

    String name;
    public String fName(String nm)
    {
        this.name = nm;
        return nm;
    }


    public int speedUp(int increment)
    {
       // this.incr = increment;
        speed += increment;
        return increment;
    }

    public int getGear()
    {
        return gear;
    }

    public int getSpeed()
    {
        return speed * getGear();
    }

    public String toString()
    {
        return("No of gears are "+ getGear()
                +"\n"
                + "speed of bicycle is "+ getSpeed() * getGear());
    }


}
