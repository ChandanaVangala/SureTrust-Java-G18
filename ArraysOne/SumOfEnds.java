package ArraysOne;

import java.util.Scanner;

public class SumOfEnds {
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
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            System.out.println(arr[start]+arr[end]);
            start++;
            end--;
        }
        if(start==end)
        {
            System.out.println(arr[start]);
        }
    }
}
