package HomeWorks.Practice16;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class WorkWithFiles1
{
    public static void copyFiles(File oldFolder, File newFolder) throws IOException
    {
        if(oldFolder.isFile())
        {
            InputStream inputStream = null;
            OutputStream outputStream = null;

            try
            {
                inputStream = new FileInputStream(oldFolder);
                outputStream = new FileOutputStream(newFolder);

                byte[] buffer = new byte[1024];
                int length;

                while ((length = inputStream.read(buffer)) > 0)
                    outputStream.write(buffer, 0, length);
            }
            finally
            {
                inputStream.close();
                outputStream.close();
            }
        }
        else if(oldFolder.isDirectory())
        {
            if(!newFolder.exists())
                newFolder.mkdirs();

            String[] tree = oldFolder.list();
            for (int i=0; i< tree.length; i++)
                copyFiles(new File(oldFolder, tree[i]), new File(newFolder, tree[i]));
        }
        else
        {
            if(!oldFolder.exists())
            {
                System.out.println("Начальная директория не существует");
                appendLogs(new Date().toString() + " - " + oldFolder.getPath() + " - This folder does not exist" + "\r");
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(System.in);

        System.out.print("Введите начальную директорию: ");
        String oldFolder = read.nextLine();

        appendLogs(new Date().toString() + " -  Initial directory: " + oldFolder + "\r");

        System.out.print("Введите конечную директорию: ");
        String newFolder = read.nextLine();

        appendLogs(new Date().toString() + " -  Destination directory: " + newFolder + "\r");

        copyFiles(new File(oldFolder),new File(newFolder));

        appendLogs(new Date().toString() + " - The copy was successful " + "\r");
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
