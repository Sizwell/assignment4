package za.ac.cput.Assigment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int gear = 7, speed = 3;
        int height = 2;
        Bicycle bicycle = new Bicycle(gear, speed);
        MountainBike mb = new MountainBike(gear, speed, height);

        bicycle.toString();

        System.out.println(mb.toString());
    }
}
