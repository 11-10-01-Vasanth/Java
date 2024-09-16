package Exception;

class Process
{
    public void execute(String s) throws Myexception
    {
        if(s.length()<5)
        {
            throw new Myexception();
        }
        System.out.println(s);
    }
}


class Myexception extends Exception
{
    Myexception()
    {

    }
}

public class OwnException
{
    Process p = new Process();
    p.execute("Vasanth");
}
