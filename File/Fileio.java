package File;

import java.io.*;

public class Fileio
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("text.txt");  
        System.out.println(fis.available());

    }   
}
