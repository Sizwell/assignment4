package za.ac.cput.Assigment4.SingleResponsibility.Bad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Assigment4.SingleResponsibility.Bad.Bad.Employee;

public class EmployeeTest {

    Employee emp;

    @Before
    public void setUp() throws Exception
    {
        emp = new Employee();
    }

    @Test
    public void getEmpId()
    {
        Assert.assertEquals(emp.getEmpId("2468"), "2458");
    }

    @Test
    public void getEmployeeName()
    {
       // Assert.assertEquals("Sizwe", emp.getEmpName("Mike"));
        Assert.assertEquals(emp.getEmpName("sizwe"), "Sizwe");
    }

    @Test
    public void getEmployeeSurname()
    {
        Assert.assertEquals(emp.getEmpSurname("Ncikana"), "ncikana");
    }

    @Test
    public void calculateTotalSalary()
    {
        //Assert.assertEquals(emp.calculateTotalSalary(5000.0), 2500.00, 00.00);
        Assert.assertEquals(5250, emp.calculateTotalSalary(5000, 1), 0.0);
    }
}