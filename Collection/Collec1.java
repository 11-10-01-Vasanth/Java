package Collection;
import java.util.*;

public class Collec1 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(100);
        System.out.println(ai.get(0));
        ai.removeAll(ai);
    }
}
