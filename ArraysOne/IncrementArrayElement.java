package ArraysOne;

import java.util.Scanner;

public class IncrementArrayElement {
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
        System.out.println("Enter value by which every array element should be incremented: ");
        int k=s.nextInt();
        System.out.println("Before increment:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("After increment:");
        for(int i=0;i<n;i++)
        {
            System.out.print((arr[i]+k)+" ");
        }
    }
}
