package Exception;
import java.util.*;

class Exce
{
    int x,y;
    public void exc()
    {
        Scanner sc = new Scanner(System.in);  
        // try
        // {
        //     x = Integer.parseInt(sc.next()); 
        //     y = Integer.parseInt(sc.next());
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Give number as inputs");
        //     exc();
        // }
        // System.out.println(x  + " + " + y);
        try {
            Thread.sleep(1000);
            System.out.println("delay");
            int x[]={0,1,2,3};
            System.out.println(x[4]);
        } 
        // catch (InterruptedException e) {
        //     System.out.println("exception occur");
        // }
        // catch(ArrayIndexOutOfBoundsException ae){
        //     // exception methods
        //     ae.printStackTrace();
        //     System.out.println(ae.getMessage());
        //     // this will return object
        //     System.out.println(ae.getCause());           
        // }
        catch(Exception e){
            System.out.println("some exception occur ==> this will execute any exception occur");
        }
        finally{
            System.out.println("It always execute either exception occur or not occur");
        }
    }
        
}

public class Excep1 
{
    public static void main(String[] args) 
    {
       Exce exp1 = new Exce();
       exp1.exc();
    } 
}
