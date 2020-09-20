package HomeWorks.Practice3;

public class Human
{
    public double mass = 76.6;
    public double length = 184.3;
    public double volume = 80.6;

    Head head = new Head();
    public void Human()
    {
        System.out.println("Масса человека: " + mass + " Высота человека: " + length + " Объем человека: " + volume);
        System.out.println("Мозг дает команды частям тела...");
        head.hand.Lift();
        head.leg.jump();
        head.hand.Down();
        head.leg.down();
        head.leg.stay();
        head.think();
        head.noThink();
        System.out.println();
    }
}
