package za.ac.cput.Assigment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {
    Bird bird;

    @Before
    public void setUp() throws Exception
    {
        bird = new Bird();
    }

    @Test
    public void move()
    {
        Assert.assertEquals(bird.move(), "I Run");
    }
}