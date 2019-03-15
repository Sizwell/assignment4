package za.ac.cput.Assigment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager mng;

    @Before
    public void setUp() throws Exception
    {
        mng = new Manager();
    }

    @Test
    public void getName()
    {
        Assert.assertEquals(mng.getName(), "Sizwe");
    }

    @Test
    public void getSurname()
    {
        Assert.assertEquals(mng.getSurname(), "Dyantyi");
    }

    @Test
    public void getPhone()
    {
        Assert.assertEquals(mng.getPhone(), 1717557292);
    }
}