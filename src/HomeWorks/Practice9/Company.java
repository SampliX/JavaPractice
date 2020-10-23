package HomeWorks.Practice9;

import java.util.Random;
import java.util.*;

public class Company
{
    Random rnd = new Random();
    Scanner read = new Scanner(System.in);
    ArrayList<Employee> workers = new ArrayList<Employee>();
    Calendar data = new GregorianCalendar();

    public void hireEmployee()
    {
        Employee employee = new Employee();
        workers.add(new Employee(employee.ChoiceFirstName(), employee.ChoiceSecondName(), new GregorianCalendar(2000 - rnd.nextInt(58), rnd.nextInt(12), rnd.nextInt(28)), "г. Москва, ул. Первомайская, 114" , "+7 993 567 15 " + (99 - rnd.nextInt(89)),rnd.nextInt(54069), ""));
    }
    public void fireEmployee(int idEmployee)
    {
        workers.remove(idEmployee);
    }
    public void setEmployees(ArrayList<Employee> emp)
    {
        workers = emp;
    }

}
