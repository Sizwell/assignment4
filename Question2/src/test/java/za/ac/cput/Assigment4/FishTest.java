package za.ac.cput.Assigment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    Fish fish;

    @Before
    public void setUp() throws Exception
    {
        fish = new Fish();
    }

    @Test
    public void move()
    {
        Assert.assertEquals(fish.move(), "I swim");
    }
}