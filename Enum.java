enum Days
{
    SUN(0),MON(1),TUES(2),WED(3);
    public int var;
    private int Days(int var)
    {
        this.var = var;
    }
}

class ennum
{
    private Days d;
    public void setDays(Days d)
    {
        this.d = d;
    } 
    public Days getDays()
    {
        return d;
    }
}

public class Enum 
{
    public static void main(String[] args)
    {
        ennum e = new ennum();
        e.setDays(Days.SUN);
        System.out.println(e.getDays());
        System.out.println(Days.values());
        for(Days s : Days.values())
        {
            System.out.println(s);
        } 
    }
      
}
