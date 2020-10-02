package HomeWorks.Practice78;

import java.util.Random;

public class Employee
{
    public String secondName;
    public String firstName;
    public double salary;
    public String position;

    Employee() {}

    Random rnd = new Random();

    void setFixedSalary(double salary) { this.salary = salary;}

    double getFixedSalary() {return salary;}

    public void setPosition(String position) {this.position = position;}

    public String getPosition() {return position;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String FirstName) {this.firstName = FirstName;}

    public void setNames()
    {
        ChoiceFirstName();
        ChoiceSecondName();
    }

    void ChoiceFirstName()
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

        firstName = FirstNames[rnd.nextInt(59)];
    }

    void ChoiceSecondName()
    {
        String[] SecondNames = new String[] { "Смит", "Уильямс", "Тейлор", "Джексон", "Уайт", "Мартин",
                "Томпсон", "Гарсиа", "Линдеманн", "Кауфман", "Оллфорд", "Остин",
                "Бейкер", "Бэчелор", "Баррингтон", "Бернштейн", "Бессель", "Биттер",
                "Клиффорд", "Чёрч", "Доусон", "Фейбер", "Гаррисон", "Гейзенберг",
                "Гессе", "Хант", "Джонсон", "Куммер", "Лейбниц", "Миллер"}; //30

        secondName = SecondNames[rnd.nextInt(29)];
    }
}
