package za.ac.cput.Assigment4.OpenClosed;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Assigment4.OpenClose.Bad.CalculateArea;
import za.ac.cput.Assigment4.OpenClose.Bad.Circle;
import za.ac.cput.Assigment4.OpenClose.Bad.Square;

public class SquareTest {

    CalculateArea ca;
    Circle cr;

    @Before
    public void setUp() throws Exception
    {
        ca = new CalculateArea();
        cr = new Circle();
    }

    @Test
    public void calcArea()
    {
        Assert.assertEquals(16, ca.calcSquareArea(ca));
    }

    @Test
    public void circleArea()
    {
        Assert.assertEquals(28.27, ca.calculateCircleArea(cr), 0);
    }

}