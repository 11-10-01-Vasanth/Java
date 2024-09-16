class Recursion
{
    int num;
    public int doFactRecur(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num*doFactRecur(num-1);
        }   
    }
}

class FactRecur
{
    public static void main(String[] args)
    {
        Recursion r = new Recursion();
        System.out.println(r.doFactRecur(3));
    }
}