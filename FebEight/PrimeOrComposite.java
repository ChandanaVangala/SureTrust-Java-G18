package FebEight;

import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f1=0;
        //logic 1: if n value is 1 million and assume each iteration takes 1 rupee, then total cost will be 1 million
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f1++;
            }
        }
        if(f1==2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Composite number");
        }

        //logic 2: cost will be reduced to half of its value
        int f2=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                f2++;
            }
        }
        if(f2==0)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Composite number");
        }
        //logic 3: cost will be reduced to squareroot of its number
        int f3=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                f3++;
            }
        }
        if(f3==0)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Composite number");
        }
    }
}
