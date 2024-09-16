package Write;
import java.io.*;

public class FileOs 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream os = new FileOutputStream("text1.txt",true);
        char ch = 'a';
        int c = (int)ch;
        os.write(c);
        os.close();
    }    
}
