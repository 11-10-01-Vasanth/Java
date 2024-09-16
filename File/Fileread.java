import java.io.*;

class Fileread
{
    public static void main(String[] arg) throws Exception
    {
        FileReader reader = new FileReader("1234.txt");
        System.out.println(reader.read());
        int i = reader.read();
        System.out.println(reader.getEncoding());
        System.out.println(i);
        System.out.println((char) i);
        System.out.println((int)'T');
    }
}