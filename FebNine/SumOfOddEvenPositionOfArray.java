package FebNine;

import java.util.Scanner;

public class SumOfOddEvenPositionOfArray {
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
        int odd_pos=0;
        int even_pos=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even_pos+=arr[i];
            }
            else{
                odd_pos+=arr[i];
            }
        }
        System.out.println("sum of even indexed elements: "+even_pos+"\nsum of odd indexed elements: "+odd_pos);
    }
}
