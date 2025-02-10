package FebNine;

import java.util.Scanner;

public class SumOfOddEvenArrayElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int odd_sum=0;
        int even_sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even_sum+=arr[i];
            }
            else{
                odd_sum+=arr[i];
            }
        }
        System.out.println("odd_sum: "+odd_sum+"\neven_sum: "+even_sum);
    }
}
