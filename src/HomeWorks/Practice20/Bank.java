package HomeWorks.Practice20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Bank implements Runnable
{
    static private long bankMoney = 0;
    static private long bankMoneyCheck = 0;
    static private HashMap<String, Account> accounts = new HashMap<String, Account>();
    static private ArrayList<String> blockedAccounts = new ArrayList<>();
    static private final Random random = new Random();
    static String line = "";
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException
    {
        accounts.put("Генадий", new Account(47826, "Генадий"));
        accounts.put("Федор", new Account(24655, "Федор"));
        accounts.put("Андрей", new Account(74225, "Андрей"));
        accounts.put("Леонид", new Account(87568, "Леонид"));
        accounts.put("Евгений", new Account(325465, "Евгений"));
        accounts.put("Джамшут", new Account(12678, "Джамшут"));
        accounts.put("Дмитрий", new Account(65752, "Дмитрий"));
        accounts.put("Ринат", new Account(12678, "Ринат"));

        for(int i = 0; i < accounts.size(); i++)
            bankMoney += accounts.get(i).money;


        line = read.nextLine();

        while (!line.equals("выход"))
        {
            String[] lineArr = line.split(" ");

            switch (lineArr[0]) {
                case ("баланс"):
                    if (lineArr.length == 2)
                        System.out.println(getBalance(lineArr[1]));
                    else
                        System.out.println("Неизвестная команда");
                    break;
                case ("перевод"):
                    if (lineArr.length == 4)
                        transfer(lineArr[1],lineArr[2],Long.parseLong(lineArr[3]));
                    else
                        System.out.println("Неизвестная команда");
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
            line = read.nextLine();
        }
    }

    public synchronized static boolean isFraud(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException
    {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    public static synchronized void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException
    {
        if (!(blockedAccounts.contains(fromAccountNum) || blockedAccounts.contains(toAccountNum)))
        {
            if (accounts.get(fromAccountNum).money >= amount && amount > 0)
            {
                if (amount <= 50000)
                {
                    accounts.get(fromAccountNum).money -= amount;
                    accounts.get(toAccountNum).money += amount;
                    System.out.println("Перевод проведен успешно");
                }
                else
                    if (isFraud(fromAccountNum, toAccountNum, amount))
                    {
                        blockedAccounts.add(fromAccountNum);
                        blockedAccounts.add(toAccountNum);
                        System.out.println("Перевод заблокирован. Подозрение в мошенничестве");
                    }
                    else
                    {
                        accounts.get(fromAccountNum).money -= amount;
                        accounts.get(toAccountNum).money += amount;
                        System.out.println("Перевод проведен успешно");
                    }
            }
            else
            {
                System.out.println("Перевод заблокирован. Недостаточно средств");
            }
        }
        else
        {
            System.out.println("Перевод заблокирован. Служба Безопасности не позволила провести перевод");
        }
    }

    public static long getBalance(String accountNum)
    {
        return accounts.get(accountNum).money;
    }

    public void checkAllSum()
    {
        for(int i = 0; i < accounts.size(); i++)
            bankMoneyCheck += accounts.get(i).money;
    }

    @Override
    public void run()
    {

    }
}
