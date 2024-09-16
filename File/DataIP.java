import java.io.*;
public class DataIP 
{
    public static void main(String[] args) throws Exception
    {
        DataInputStream dis = new DataInputStream(System.in);
        String s = dis.readLine("Enter Name");
        System.out.println("Name" + s);      
    }
}