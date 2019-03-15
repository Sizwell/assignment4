package za.ac.cput.Assigment4.SingleResponsibility.Bad.Bad;

public class Employee
{
    private String empId;
    private String empName;
    private String empSurname;
    private double empSalary = 5000;
    private double commission = 0.05;
    private int sales;

    public Employee()
    {

    }

    public String getEmpId(String id)
    {
        this.empId = id;
        return empId;
    }

    public String getEmpName(String name)
    {
        this.empName = name;
        return empName;
    }

    public String getEmpSurname(String surname)
    {
        this.empSurname = surname;
        return empSurname;
    }

    public double getSalary(double salary)
    {
        this.empSalary = salary;
        return empSalary;
    }

    public double getCommission(double comm)
    {
        this.commission = comm;
        return commission;
    }

    public int getSales(int sale)
    {
        this.sales = sale;
        return sales;
    }

    public double calculateTotalSalary(double totSalary, int sls) {

     totSalary = (empSalary * commission) + empSalary ;
        return totSalary;
    }

 }
