package HomeWorks.Practice9;

import java.util.ArrayList;
import java.util.Random;

public class HandleEmployees implements ISalaryChange
{
    Company company = new Company();
    Random rnd = new Random();
    Employee em = new Employee();

    ArrayList<Employee> workers = company.workers;
    int b = rnd.nextInt(21594);

    @Override
    public void changeEmployeeSalary()
    {
        for(int i = 2; i < i + 3; i++)
        {
            workers.get(i).setEmployeeSalary(rnd.nextInt(65986));
        }
    }

    public IDemonition demonition = (workers, b) ->
    {
        workers.setEmployeeSalary(b);
        workers.setEmployeePosition("Janitor");
        workers.setFirstName();
        workers.setSecondName();
        System.out.println(em.getFirstName() + " " + em.getSecondName() + " " + em.getPosition() + " " + em.getSalary());
    };

    IEmployeePosition employeePosition = new IEmployeePosition() {
        @Override
        public void setNamePosition()
        {
            for(int i = 0; i < workers.size();i++)
            {
                int a = rnd.nextInt(2);

                if (a == 0)
                    workers.get(i).setEmployeePosition("Junior Programmer");
                else if(a == 1)
                    workers.get(i).setEmployeePosition("Backend Programmer");
                else
                    workers.get(i).setEmployeePosition("Programmer");
            }
        }
    };

    public void run()
    {
        hireCompanyEmployeers();

        employeePosition.setNamePosition();

        demonition.DemonitToCleaner(em, rnd.nextInt(21345));

    }

    public void hireCompanyEmployeers()
    {
        for(int i = 0; i < 22 - rnd.nextInt(15); i++)
        {
            company.hireEmployee();
        }
    }
}