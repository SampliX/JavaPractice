package HomeWorks.Practice18;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseMetroSite
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            ArrayList<String> metroStations = new ArrayList<String>();
            Document doc = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://www.google.com").maxBodySize(0).get();
            Elements metroStation = doc.select("div.js-metro-stations.t-metrostation-list-table");
            Elements metroLine = doc.select("span.js-metro-line.t-metrostation-list-header.t-icon-metroln");

            for(Element metroln : metroLine)
            {
                metroStations.add(metroln.attr("data-line") + ", " + metroln.text());
            }
            for(Element metrost : metroStation)
            {
                System.out.println(parseLine(metrost.text()));
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

    public static String parseLine(String str)
    {
        String[] line = str.split("\\.");
        String src = "";
        for(int i = 0; i < line.length; i++)
        {
            src += line + ", ";
        }
        return src;
    }
}
