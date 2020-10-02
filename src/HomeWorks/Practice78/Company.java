package HomeWorks.Practice78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Company
{
    public static int totalRevenue = 0;

    Scanner read = new Scanner(System.in);

    Employee employee = new Employee();
    TopManager topManager = new TopManager();
    Manager manager = new Manager();
    Operator operator = new Operator();

    public void hire(String employeePos, Employee employee)
    {
        switch (employeePos) {
            case "Manager":  employee.setFixedSalary(new Manager().calcSalary());
                employee.setPosition(manager.getJobTitle());
                break;
            case "Top Manager":  employee.setFixedSalary(new TopManager().calcSalary());
                employee.setPosition(topManager.getJobTitle());
                break;
            case "Operator":  employee.setFixedSalary(new Operator().calcSalary());
                employee.setPosition(operator.getJobTitle());
                break;
        }
    }
    public void hireAll(String employeePos, int amount, List<Employee> employees)
    {
        for (int i = 0; i < amount; i++) {
            switch (employeePos) {
                case "Manager":
                    employees.add(i, new Employee(manager.getJobTitle()));
                    employees.get(i).setFixedSalary(manager.calcSalary());
                    break;
                case "Top Manager":
                    employees.add(i, new Employee(topManager.getJobTitle()));
                    employees.get(i).setFixedSalary(topManager.calcSalary());
                    break;
                case "Operator":
                    employees.add(i, new Employee(operator.getJobTitle()));
                    employees.get(i).setFixedSalary(operator.calcSalary());
                    break;
            }
        }
        System.out.println(amount + " employees hired.");
    }

    void fire(String name, List<Employee> employees)
    {
        for(int i=0; i<employees.size(); i++)
        {
            if (name == employees.get(i).getFirstName())
            {
                System.out.println(employees.get(i).getFirstName() + " fired");
                employees.remove(i);
            }
        }
    }

    void fireAll(int amount, List<Employee> employees)
    {
        for(int i=0; i<amount; i++)
        {
            System.out.println(employees.get(i).getPosition() + " fired");
            employees.remove(i);
        }
    }

    private void sortSalary(List<Employee> employees)
    {
        for(int i=0; i < employees.size(); i++)
        {
            for(int j=i; j < employees.size(); j++)
            {
                if(employees.get(i).getFixedSalary() > employees.get(j).getFixedSalary())
                    Collections.swap(employees, i, j);
            }
        }
    }

    List<Employee> getLowestSalaryStaff(List<Employee> employees, int count)
    {
        sortSalary(employees);
        if(employees.size() > count){
            for(int i=count; i<employees.size(); i++){
                employees.remove(i);
            }
        }
        return employees;
    }

    List<Employee> getTopSalaryStaff(List<Employee> employees, int count) {
        sortSalary(employees);
        if (employees.size() > count) {
            for (int i = employees.size() - count; i > 0; i--) {
                employees.remove(i);
            }
        }
        return employees;
    }
}
