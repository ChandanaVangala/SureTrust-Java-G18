package FebNine;
import java.util.Scanner;
public class SumOfArray {
    //sum of odd even elements
    //sum of odd even positions
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
