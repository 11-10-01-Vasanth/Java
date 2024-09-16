package Collection;
import java.util.*;

public class Arraylistdemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter array length");
        n = scanner.nextInt();
        System.out.println("Enter a list of integers");
        for(int i=0; i<n; i++){
            list.add(i, scanner.nextInt()); 
        }
        System.out.println(list);
        scanner.close();
    }
}
