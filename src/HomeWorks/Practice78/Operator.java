package HomeWorks.Practice78;

public class Operator implements EmployeePosition{
    @Override
    public String getJobTitle() {
        return "Operator";
    }
    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
