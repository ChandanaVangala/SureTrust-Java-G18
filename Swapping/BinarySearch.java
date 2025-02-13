package Swapping;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,4,2};
        System.out.println("Enter target: ");
        Arrays.sort(arr);
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        int idx=-1;
        int i=0,j=arr.length-1,mid;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(target==arr[mid])
            {
                idx=mid;
                break;
            }
            else if(target>arr[mid])
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        if(idx!=-1)
        {
            System.out.println("Target found at index: "+idx);
        }
        else
        {
            System.out.println("Target not found.");
        }
    }
}
