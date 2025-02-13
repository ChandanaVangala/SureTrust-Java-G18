package Swapping;

public class SwapTwo1 {
    public static void main(String[] args) {
        int a=11, b=22;
        System.out.println("Before swapping: "+"a: "+a+" b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: "+"a: "+a+" b: "+b);
    }
}
