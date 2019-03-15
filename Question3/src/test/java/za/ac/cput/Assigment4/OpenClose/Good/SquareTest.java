package za.ac.cput.Assigment4.OpenClose.Good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square sqr;
    @Before
    public void setUp() throws Exception
    {
        sqr = new Square();
    }

    @Test
    public void calculateArea()
    {
        Assert.assertEquals(28.25, sqr.calculateArea(), 0.0);

    }
}