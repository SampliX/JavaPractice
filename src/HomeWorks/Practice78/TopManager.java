package HomeWorks.Practice78;

public class TopManager implements EmployeePosition{
    @Override
    public String getJobTitle(){
        return ("Top Manager");
    }
    @Override
    public double calcSalary(double baseSalary) {
        Company company = new Company();
        if (company.getIncomeNumber()<10000000){
            return baseSalary;
        }
        else {
            return 2.5*baseSalary;
        }
    }
}
