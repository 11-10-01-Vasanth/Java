package DataInputStream;
import java.io.*;

public class DtaInputStream 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("data.txt");
        DataInputStream dis = new DataInputStream(fis);
        String s = dis.readLine();
        FileOutputStream fos = new FileOutputStream("data1.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeChars("Hello");
        System.out.println(s);
    } 
}
