package HomeWorks.Practice78;

public class Operator implements EmployeePosition
{
    @Override
    public String getJobTitle() {return "Operator";}

    @Override
    public double calcSalary()
    {
        return 45000;
    }
}
