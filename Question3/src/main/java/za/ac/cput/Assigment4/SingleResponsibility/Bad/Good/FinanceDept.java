package za.ac.cput.Assigment4.SingleResponsibility.Bad.Good;

public class FinanceDept {

    private int deptId;
    private String deptName;


    public FinanceDept()
    {

    }

    public int getDeptId(int id)
    {
      return this.deptId = id;
    //  return deptId;
    }

    public String getDeptName(String name)
    {
        return this.deptName = name;
    }

    public double calculateTotalSalary(double salary, double comm) {

        double totSalary = (salary * comm) +salary ;
        return totSalary;
    }

}
