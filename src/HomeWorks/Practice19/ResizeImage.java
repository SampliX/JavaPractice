package HomeWorks.Practice19;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResizeImage
{
    public static void main(String[] args)
    {
        String srcFolder = "images";
        String dstFolder = "dst";

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();

        File[] files = srcDir.listFiles();

        try
        {
            if (!Files.exists(Paths.get(dstFolder)))
            {
                Files.createDirectories(Paths.get(dstFolder));
            }

            for(int i = 0; i < files.length; i++)
            {
                Runnable resize = new AsyncImageResize(files[i], dstFolder, start);
                resize.run();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
