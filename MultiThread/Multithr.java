class LoopIt extends Thread 
{
    @Override
    public void run()
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class Multithr {
    public static void main(String[] args)
    {
       LoopIt it = new LoopIt();
       it.start();
       LoopIt it1 = new LoopIt();
       it1.start();
    }
}
