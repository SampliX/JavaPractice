package HomeWorks.Practice78;

public class Manager implements EmployeePosition {
    @Override
    public String getJobTitle(){
        return ("Manager");
    }
    @Override
    public double calcSalary(double baseSalary) {
        return (baseSalary+Math.floor(Math.random()*25_000)+115_000);
    }
}
