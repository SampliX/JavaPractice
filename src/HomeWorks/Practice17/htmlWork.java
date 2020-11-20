package HomeWorks.Practice17;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class htmlWork
{
    public static void main(String[] args) throws Exception
    {
        try {
            ArrayList<String> addresses = new ArrayList<String>();
            Document doc = Jsoup.connect("https://www.mirea.ru/").userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://www.google.com").get();
            Elements img = doc.select("img");
            for (Element el : img) {
                addresses.add(el.absUrl("src"));
                downloadImg(el.absUrl("src"));
            }

            System.out.println(img);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    public static void downloadImg(String src) throws Exception
    {
        String folder = null;

        int indexname = src.lastIndexOf("/");

        if (indexname == src.length()) {
            src = src.substring(1, indexname);
        }

        indexname = src.lastIndexOf("/");
        String name = src.substring(indexname, src.length());

        System.out.println(name);

        URL url = new URL(src);
        InputStream in = url.openStream();

        OutputStream out = new BufferedOutputStream(new FileOutputStream( "images\\" + name));

        for (int b; (b = in.read()) != -1;) {
            out.write(b);
        }
        out.close();
        in.close();
    }

}
