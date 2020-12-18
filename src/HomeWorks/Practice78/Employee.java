package HomeWorks.Practice78;

public class Employee {
    private String surname;
    private String name;
    private double baseSalary;
    private String position;
    public Employee(String surname, String name, double baseSalary, String position) {
        this.surname = surname;
        this.name = name;
        this.baseSalary = baseSalary;
        this.position = position;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}