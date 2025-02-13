package Swapping;

public class SwapTwo2 {
    public static void main(String[] args) {
        int a=11, b=22;
        System.out.println("Before swapping: "+"a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Before swapping: "+"a: "+a+" b: "+b);
    }
}
