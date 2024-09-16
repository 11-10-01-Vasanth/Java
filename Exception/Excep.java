package Exception;

public class Excep
{
    public static void main(String[] args)
    {
        // int x[] = {1,2};
        // try
        // {
        //     System.out.println(x[0]);
        //     System.out.println(5/0);
        //     System.out.println(x[2]);
        // }
        // catch (Exception e)
        // {
        //     System.out.println("Error");
        // }
        int x[] = {1,2};
        try
        {
            System.out.println(x[0]);
            System.out.println(5/0);
            System.out.println(x[2]);
        }
        catch(Exception e)
        {
            // System.out.println(e.getMessage());
            // e.printStackTrace();
            System.out.println("Error");
        }
    }    
}
