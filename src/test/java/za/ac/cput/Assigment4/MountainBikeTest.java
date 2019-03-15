package za.ac.cput.Assigment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MountainBikeTest {

    MountainBike mb;

    @Before
    public void setUp() throws Exception
    {
        mb = new MountainBike(3, 3, 3);
    }

    @Test
    public void getSeatHeight()
    {
        Assert.assertEquals(mb.getSeatHeight(), 4);
    }

    @Test
    public void getSpeed()
    {
        Assert.assertEquals(mb.getSpeed(), 8);
    }

    @Test
    public void getGear()
    {
        Assert.assertEquals(mb.getGear(), 3);
    }
}