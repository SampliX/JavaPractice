package HomeWorks.Practice2;

import java.util.Scanner;

public class DogKennel
{
    String name;
    double age;
    Scanner Read = new Scanner(System.in);

    public void dogs()
    {
        int dogValue = 0;

        System.out.println("Введите количество новых собак в питомнике: ");
        dogValue = Read.nextInt() + 2;
        
        Dog[] arrDog = new Dog[dogValue];

        arrDog[0] = new Dog("Бобик", 3);
        arrDog[1] = new Dog("Тузик", 3.51);

        Dog dog = new Dog(name,age);

        for (int i = 2; i < arrDog.length; i++)
        {
            System.out.println("Введите кличку и возраст собаки через Enter ");
            arrDog[i]= new Dog(Read.next(),Read.nextDouble());
        }

        for(int i = 0; i < arrDog.length; i++)
        {
            System.out.println(arrDog[i].toString());
        }
    }
}
