package HomeWorks.Practice78;

import java.util.Random;

public class TopManager implements EmployeePosition
{
    @Override
    public String getJobTitle()
    {
        return "Top Manager";
    }

    @Override
    public double calcSalary()
    {
        if(Company.totalRevenue > 10000000)
            return 1.5 * 100000 + 100000;
        else
            return 100000;
    }
}
