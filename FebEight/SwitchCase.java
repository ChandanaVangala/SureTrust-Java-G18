package FebEight;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[])
    {   
        int i;
        Scanner s=new Scanner(System.in);
        do { 
            System.out.println("1. Calculate area of circle\n2. Calculate area of triangle\n3. Calculate area of square\n4. Calculate area of rectangle\n5. Exit");
            System.out.println("Enter your choice: ");
            i=s.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println("Enter radius:");
                    int r=s.nextInt();
                    System.out.println("Area of circle: "+ Math.PI*(r*r));
                break;
                case 2:
                    System.out.println("Enter base and height of triangle: ");
                    int base=s.nextInt();
                    int h=s.nextInt();
                    System.out.println("Area of triangle: "+(base*h)/2);
                break;
                case 3:
                    System.out.println("Enter side of sqaure: ");
                    int side=s.nextInt();
                    System.out.println("Area of square: "+(side*side));
                break;
                case 4:
                    System.out.println("Enter length and breadth of rectangle: ");
                    int l=s.nextInt();
                    int b=s.nextInt();
                    System.out.println("Area of rectangle: "+(l*b));
                break;
                case 5:
                break;
            }

        }while(i!=5);
    }
}
