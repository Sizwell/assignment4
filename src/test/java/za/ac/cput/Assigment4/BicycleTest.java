package za.ac.cput.Assigment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BicycleTest {

    Bicycle bc;

    @Before
    public void setUp() throws Exception
    {
        bc = new Bicycle(7, 2);
    }

    @Test
    public void breakDown()
    {
        Assert.assertEquals(bc.breakDown(9), 9);
    }


    @Test
    public void speedUp()
    {
        Assert.assertEquals(bc.speedUp(3), 3);
    }

    @Test
    public void getGear()
    {
        Assert.assertEquals(bc.getSpeed(), 12);
    }

    @Test
    public void getSpeed()
    {
        Assert.assertEquals(bc.getSpeed(), 14);
    }
}