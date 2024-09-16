enum week
{
    SUN,MON,TUES,WED
}

class Weeks
{
    private week w;
    public void setWeek(week w)
    {
        this.w = w;
    } 
    public week getWeek()
    {
        return w;
    }
}

class demo
{
    public static void main(String[] args)
    {
        Weeks w = new Weeks();
        w.setWeek(week.MON);
        System.out.println(w.getWeek());
    }
}