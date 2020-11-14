package HomeWorks.Practice16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class WorkWithFiles
{
    public static void main(String[] args) throws IOException
    {
        int it = 0;
        String line = "";
        String path;
        Scanner read = new Scanner(System.in);

        try
        {
            System.out.print("Введите путь до папки: ");
            path = read.nextLine();

            appendLogs(new Date().toString() + " - The path to the file: " + path + "\r");

            File folder = new File(path);
            if(folder.exists())
            {
                double result = getFolderSize(folder);

                while (result > 1024) {
                    result /= 1024;
                    it++;
                }

                if (it == 0)
                    line = " byte ";
                else if (it == 1)
                    line = " Kb ";
                else if (it == 2)
                    line = " Mb ";
                else if (it >= 3)
                    line = " Gb ";

                System.out.print("Её размер: ");
                System.out.format("%.1f", result);
                System.out.print(line);

                appendLogs(new Date().toString() + " - " + "folder: " + path + ", size: " + result + line + "\r");
            }
            else
            {
                System.out.println("Данной папки не существует");
                appendLogs(new Date().toString() + " - " + path + " - This folder does not exist" + "\r");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
            appendLogs(new Date().toString() + " - The program terminated with an error: " + ex.toString() + "\r");
        }
    }

    public static double getFolderSize(File folder) {
        long size = 0;
        File[]files = folder.listFiles();

        int it = files.length;

        for (int i = 0; i < it; i++)
        {
            if (files[i].isFile())
                size += files[i].length();
            else
                size += getFolderSize(files[i]);
        }
        return size;
    }

    public static void appendLogs(String input) throws IOException
    {
        String logPath = "Logs\\log.txt";

        if(!new File("Logs").exists())  {
            File file = new File("Logs");
            file.mkdirs();
        }
            FileOutputStream outputStream = new FileOutputStream(logPath, true);

            outputStream.write(input.getBytes());
            outputStream.close();
    }
}
