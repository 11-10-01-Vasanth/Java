// import org.w3c.dom.css.Counter;

class Stat
{
    static int amount;
    public void setAmount(int amount){
        this.amount = this.amount + amount;
    }
    public int getAmount(){
        return amount;
    }
}
public class Static
{
    public static void main(String[] arg){
        Stat c1 = new Stat();
        c1.setAmount(1000);
        c1.setAmount(550);
        c1.setAmount(300);
        Stat c2 = new Stat();
        c2.setAmount(450);
        c2.setAmount(700);

        System.out.println(c1.getAmount());
        System.out.println(c2.getAmount());
    }
    
}
