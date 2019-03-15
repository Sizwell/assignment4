package za.ac.cput.Assigment4.OpenClose.Bad;

public class CalculateArea extends Square {
    Square square;

    public CalculateArea()
    {

    }

    public int calcSquareArea(Square square)
    {
        //int ar = square.getLegth(4) * square.getBreath(6);
        return square.getLegth(4) * square.getBreath(4);
    }

    public double calculateCircleArea(Circle circle)
    {
        return (Math.PI)* circle.getRadius(3) * circle.getRadius(3);
    }


}
