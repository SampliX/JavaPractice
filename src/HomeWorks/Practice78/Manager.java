package HomeWorks.Practice78;

import java.util.Random;

public class Manager implements EmployeePosition
{
    @Override
    public String getJobTitle()
    {
        return "Manager";
    }

    @Override
    public double calcSalary()
    {
        Random rnd = new Random();
        int a = 140000 - rnd.nextInt(25000);
        Company.totalRevenue += a * 0.95;
        return 65000 + 0.05 * a;
    }
}
