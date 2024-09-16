package Collection;

import java.util.*;

public class Arraylist1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("vasanth");
        list.add(0,"mahesh");
        list.add("jeya");
        System.out.println(list);
        
        for(String s:list)
        {
            System.out.println(s);
        }

        list.removeAll(list);
        list.add("Ganesh");

        System.out.println(list);
    }
}
