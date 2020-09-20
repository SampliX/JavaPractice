package HomeWorks.Practice2;

public class Dog
{
    public String NickNames;
    public double Age;

    public Dog(String NickName, double age)
    {
        this.NickNames = NickName;
        this.Age = age;
    }
    public double dogAgeToHuman()
    {
        return Age * 7;
    }
    public String toString()
    {
        return "Кличка: " + NickNames + ", Возраст собаки: " + Age + ", Возраст собаки в человеческом возрасте:" + dogAgeToHuman();
    }
}