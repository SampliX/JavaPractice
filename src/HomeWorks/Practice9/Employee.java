package HomeWorks.Practice9;

import java.util.Calendar;
import java.util.Random;

public class Employee
{
    String firstName;
    String secondName;
    Calendar data;
    String address;
    String telephoneNumber;
    int salary;
    String position;

    Random rnd = new Random();

    public Employee() { }
    public Employee(String firstName, String secondName, Calendar data, String address, String telephoneNumber, int salary, String position) { }

    public void setEmployeeSalary(int salary1)
    {
        this.salary = salary1;
    }

    public void setEmployeePosition(String position1)
    {
        this.position = position1;
    }

    public void setFirstName()
    {
        this.firstName = ChoiceFirstName();
    }

    public void setSecondName()
    {
        this.secondName = ChoiceSecondName();
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getPosition() {
        return position;
    }

    public int getSalary() { return salary; }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    String ChoiceFirstName()
    {
        String[] FirstNames = new String[] { "Аллистир", "Алфорд", "Аррон", "Адриан", "Абнер", "Абрахам",
                "Бенджи", "Бертон", "Боб", "Барни", "Борис", "Барри", "Блэйк",
                "Вик", "Верн", "Вилберн",
                "Грэг", "Гарри", "Гейб",
                "Дэвид", "Джордж", "Джэйсон", "Джим", "Джереми", "Джеймс", "Джо",
                "Зак",
                "Курт", "Криспин", "Квентин", "Кристиан", "Клэр", "Кэйси", "Кэри",
                "Лютер",
                "Мэйсон", "Мики",
                "Невилл", "Натан", "Ник",
                "Обри",
                "Пит", "Пирс", "Пол",
                "Роберт", "Раймунд", "Рэд",
                "Спенсер",
                "Тед",
                "Франклин", "Форрест",
                "Харлин", "Хаммонд",
                "Шерлок", "Шаннон",
                "Эмиль", "Эшли", "Эдисон", "Эмметт", "Эммануель"}; //60

        return FirstNames[rnd.nextInt(59)];
    }

    String ChoiceSecondName()
    {
        String[] SecondNames = new String[] { "Смит", "Уильямс", "Тейлор", "Джексон", "Уайт", "Мартин",
                "Томпсон", "Гарсиа", "Линдеманн", "Кауфман", "Оллфорд", "Остин",
                "Бейкер", "Бэчелор", "Баррингтон", "Бернштейн", "Бессель", "Биттер",
                "Клиффорд", "Чёрч", "Доусон", "Фейбер", "Гаррисон", "Гейзенберг",
                "Гессе", "Хант", "Джонсон", "Куммер", "Лейбниц", "Миллер"}; //30

        return SecondNames[rnd.nextInt(29)];
    }
}