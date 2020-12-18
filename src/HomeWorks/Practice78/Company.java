package HomeWorks.Practice78;

import java.util.List;

public class Company {
    double baseSalaryManager = 100_000;                                      //Можно менять фикс. оклад, но в сотрудниках будет хранится их зп
    double baseSalaryTopManager = 130_000;
    double baseSalaryOperator = 70_000;
    double income = 12318573;
    public void hire (String position, int number, List<Employee> employees){
        if (position.equals("Manager")){
            employees.get(number).setSurname("AmUser");
            employees.get(number).setName("AmUser");
            employees.get(number).setBaseSalary(new Manager().calcSalary(baseSalaryManager));
            employees.get(number).setPosition(new Manager().getJobTitle());
            System.out.println("1 сотрудник нанят.");
        }
        else if (position.equals("Top Manager")){
            employees.get(number).setSurname("AtmUser");
            employees.get(number).setName("AtmUser");
            employees.get(number).setBaseSalary(new TopManager().calcSalary(baseSalaryTopManager));
            employees.get(number).setPosition(new TopManager().getJobTitle());
            System.out.println("1 сотрудник нанят.");
        }
        else if (position.equals("Operator")){
            employees.get(number).setSurname("AopUser");
            employees.get(number).setName("AopUser");
            employees.get(number).setBaseSalary(new Operator().calcSalary(baseSalaryOperator));
            employees.get(number).setPosition(new Operator().getJobTitle());
            System.out.println("1 сотрудник нанят.");
        }
        else
        {
            System.out.println(" Неккоректный ввод. ");
        }
    }
    public void hireAll(String position, int area, List<Employee> employees) {
        int j = employees.size();
        for (int i = employees.size(); i < area+j; i++) {
            if (position == "Manager") {
                employees.add(i, new Employee("Am" + i,"Am" + i, new Manager().calcSalary(baseSalaryManager), new Manager().getJobTitle()));
            }
            if (position == "Top Manager") {
                employees.add(i, new Employee("Atm" + i,"Atm" + i, new TopManager().calcSalary(baseSalaryTopManager), new TopManager().getJobTitle()));
            }
            if (position == "Operator") {
                employees.add(i, new Employee("Aop" + i,"Aop" + i, new Operator().calcSalary(baseSalaryOperator), new Operator().getJobTitle()));
            }
        }
        System.out.println("Сотрудники в количестве: " + area + " наняты.");
    }
    public void fire(int i, List<Employee> employees){
        System.out.println(employees.get(i).getPosition() + " " + employees.get(i).getName() + " уволен.");
        employees.remove(i);
    }
    public void fireAll(int area, List<Employee> employees) {
        for (int i = 0; i < area; i++) {
            employees.remove(0);
        }
        outputList(employees);
        System.out.println("Первые " + area + " уволены.");
    }
    public void sortSalary(List<Employee> employees){
        for(int i=1; i < employees.size(); i++){
            for(int j=0; j < employees.size()-1; j++){
                double q1 = employees.get(i).getBaseSalary();
                double q2 = employees.get(j).getBaseSalary();
                if(q1 < q2){
                    Employee employee = new Employee(employees.get(j).getName(),employees.get(j).getSurname(),
                            employees.get(j).getBaseSalary(),employees.get(j).getPosition());
                    employees.set(j,employees.get(i));
                    employees.set(i,employee);
                }
            }
        }
        outputList(employees);
    }
    public List<Employee> getLowestSalaryStaff(List<Employee> employees, int count){
        if((employees.size()>count) && (count>0)){
            for(int i=0; i<count; i++){
                System.out.println(i + ". " + employees.get(i).getPosition() + " " + employees.get(i).getSurname() + " " +
                        employees.get(i).getName() + " " + employees.get(i).getBaseSalary() + ";");
            }
        }
        else{
            System.out.println("Введенное <count> вышло за пределы допустимого.");
        }
        return employees;
    }
    public List<Employee> getTopSalaryStaff(List<Employee> employees, int count) {
        if ((employees.size() > count) && (count>0)) {
            for (int i = employees.size()-count; i < employees.size(); i++) {
                System.out.println(i + ". " + employees.get(i).getPosition() + " " + employees.get(i).getSurname() + " " +
                        employees.get(i).getName() + " " + employees.get(i).getBaseSalary() + ";");
            }
        }
        else{
            System.out.println("Введенное <count> вышло за пределы допустимого.");
        }
        return employees;
    }
    public void getIncome(){
        System.out.println(income/1000000 + " *10^6" + " комания смогла получить.");
    }
    public double getIncomeNumber(){
        return income;
    }
    public void outputList(List<Employee> employees){
        for(int i=0; i < employees.size(); i++){
            System.out.println(i + ". " + employees.get(i).getPosition() + " " + employees.get(i).getSurname() + " " +
                    employees.get(i).getName() + " " + employees.get(i).getBaseSalary() + ";");
        }
    }
}
