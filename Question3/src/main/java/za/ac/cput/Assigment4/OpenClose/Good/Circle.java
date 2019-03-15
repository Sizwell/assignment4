package za.ac.cput.Assigment4.OpenClose.Good;

public class Circle implements Shapes{

    int radius;

    @Override
    public int calculateArea()
    {
        return (int) ((Math.PI) * (radius * radius));
    }
}
