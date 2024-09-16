class Thr{
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(i);
                Thread.sleep(300);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class Threaddemo {
    public static void main(String[] args)
    {
        Thr thr = new Thr();
        thr.run();
    }
}
