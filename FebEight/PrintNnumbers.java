package FebEight;
import java.util.Scanner;
class PrintNnumbers{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //logic 1
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        //logic 2
        for(int i=1;i<n+1;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        //logic 3
        int i=1;
        while(i<n+1)
        {
            System.out.print(i+" ");
            i++;
        }
    }
}