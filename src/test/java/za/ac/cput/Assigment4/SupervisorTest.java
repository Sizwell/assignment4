package za.ac.cput.Assigment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SupervisorTest {

    Supervisor sv;
    @Before
    public void setUp() throws Exception
    {
        sv = new Supervisor();
    }

    @Test
    public void getName()
    {
        Assert.assertEquals(sv.getName(), "Chris");
    }

    @Test
    public void getSurname()
    {
        Assert.assertEquals(sv.getSurname(), "Ncikana");
    }

    @Test
    public void getPhone()
    {
        Assert.assertEquals(sv.getPhone(), 1785100865);
    }
}