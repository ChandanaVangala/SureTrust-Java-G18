package Swapping;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,4,2};
        System.out.println("Enter target: ");
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        int idx=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                idx=i;
                break;
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
