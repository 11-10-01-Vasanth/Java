package Collection;
import java.util.*;
public class Arraydeq 
{
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(10);
        queue.add(5);
        System.out.println(queue);
    }    
}
