package FebEight;

import java.util.Scanner;

public class PrintNodd {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0,i=1;
        while(c<n)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
                c++;
            }
            i++;
        }
    }
}
