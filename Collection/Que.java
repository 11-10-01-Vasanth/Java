package Collection;
import java.util.*;
public class Que 
{
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(20);
        queue.add(10);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }   
}
