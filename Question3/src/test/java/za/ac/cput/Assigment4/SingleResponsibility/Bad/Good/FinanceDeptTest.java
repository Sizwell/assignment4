package za.ac.cput.Assigment4.SingleResponsibility.Bad.Good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceDeptTest {

    FinanceDept finDept;
    @Before
    public void setUp() throws Exception
    {
        finDept = new FinanceDept();
    }

    @Test
    public void getDeptId()
    {
        Assert.assertEquals(finDept.getDeptId(1246), 2356);
    }


    @Test
    public void getDeptName()
    {
        Assert.assertEquals(finDept.getDeptName("Finance department"), "Department of Finance");
    }

    @Test
    public void calculateTotalSalary()
    {
        Assert.assertEquals(finDept.calculateTotalSalary(5000, 0.05), 5250, 0.0);
    }
}