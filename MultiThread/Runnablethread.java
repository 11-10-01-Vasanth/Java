class LoopIt implements Runnable
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
public class Runnablethread
{
    public static void main(String[] args)
    {
       LoopIt it = new LoopIt();
       Thread t = new Thread(it);
       t.start();
       LoopIt it1 = new LoopIt();
       Thread t1 = new Thread(it1);
       t1.start();
    }
}
