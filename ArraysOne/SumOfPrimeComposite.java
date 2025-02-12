package ArraysOne;

import java.util.Scanner;

public class SumOfPrimeComposite {
    static boolean isPrime(int p)
    {
        for(int i=2;i<=Math.sqrt(p);i++)
        {
            if(p%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int p_sum=0;
        int c_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
            {
                //System.out.println("prime: "+arr[i]);
                p_sum+=arr[i];
            }
            else{
                //System.out.println("Composite: "+arr[i]);
                c_sum+=arr[i];
            }
        }
        System.out.println("Sum of Prime numbers: "+p_sum+"\nSum of composite numbers: "+c_sum);
    }
}
