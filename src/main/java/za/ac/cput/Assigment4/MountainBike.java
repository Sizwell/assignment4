package za.ac.cput.Assigment4;

public class MountainBike extends Bicycle{

    int seatHeight = 2;
    public MountainBike(int gr, int spd, int startHeight) {
        super(gr, spd);

        this.seatHeight = startHeight;

    }

    public int getSeatHeight()
    {
        return seatHeight;
    }

    public int getSpeed()
    {
       return super.getSpeed();
    }

    public int getGear()
    {
        return super.getGear();
    }

    public String toString()
    {
        return (super.toString() + "\nseat height is " + getSeatHeight());
    }
}
