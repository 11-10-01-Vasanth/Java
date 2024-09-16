class Swap
{
    public static void main(String[] args)
    {
        int a = 50,b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}