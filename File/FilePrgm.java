package File;
import java.io.*;
import java.sql.Date;

public class FilePrgm 
{
    public static void main(String[] args)
    {
        File file = new File("text.txt");
        // System.out.println(file.isDirectory());
        // System.out.println(file.isFile());
        // System.out.println(file.lastModified());
        // System.out.println(file.getPath());
        // System.out.println(file.length());
        Date d = new Date(file.lastModified());
        System.out.println(d.getDate());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
        System.out.println(d.getMonth() + 1);
    }
    
}
