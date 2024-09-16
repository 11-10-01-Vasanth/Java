class Single
{
    private Single() 
    {
        System.out.println("Hello");
    }
    static Single s;
    public static Single get()
    {
        if(s==null)
        {
            s = new Single();
        }
        return s; 
    }
}

class Singleton
{
    public static void main(String[] args)
    {
        Single o = Single.get();
        Single p = Single.get();
    }
}