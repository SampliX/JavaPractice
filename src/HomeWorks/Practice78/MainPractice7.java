package HomeWorks.Practice78;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPractice7 {
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<Employee>();
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        company.hireAll("Operator", 180, employees);
        company.hireAll("Manager",80, employees);
        company.hireAll("Top Manager", 10, employees);
        company.outputList(employees);
        System.out.println("В данный момент наняты такие сотрудники ");

        System.out.println("Добавьте нового сотрудника. Введите: должность, на место кого хотите заменить:");
        String position = scanner.nextLine();
        int number = scanner.nextInt();
        company.hire(position, number, employees);
        company.outputList(employees);

        System.out.println("Увольте любого сотрудника: ");
        int number1 = scanner.nextInt();
        company.fire(number1, employees);

        System.out.println("Увольте первых <n> человек, введите n: ");
        int number2 = scanner.nextInt();
        company.fireAll(number2,employees);
        company.sortSalary(employees);
        company.getIncome();

        System.out.println("Введите count для убывания: ");
        int number3 = scanner.nextInt();
        company.getLowestSalaryStaff(employees,number3);

        System.out.println("Введите count для возрастания: ");
        int number4 = scanner.nextInt();
        company.getTopSalaryStaff(employees,number4);
    }
}
