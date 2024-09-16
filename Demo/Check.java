import java.util.*;
public class Check {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int i;
        for(i=0;i<ch.length;i++)
        {
            int j;
            int count = 0;
            int count1 = 0;
            if(ch[i]=='{')
            {
                for(j=0;j<ch.length;j++)
                {
                    if(ch[j]=='}')
                    {
                        count++;
                    }
                }
                if(count>0)
                {
                    System.out.println("True");
                }
            }
            
            if(ch[i]=='}')
            {
                for(j=0;j<ch.length;j++)
                {
                    if(ch[j]=='{')
                    {
                        count1++;
                    }
                }
                if(count1>0)
                {
                    System.out.println("True");
                }
            }
        }
    }
}
