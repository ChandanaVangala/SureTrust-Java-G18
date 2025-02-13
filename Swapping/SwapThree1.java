package Swapping;

public class SwapThree1 {
    public static void main(String[] args) {
        int a=11, b=22, c=33;
        System.out.println("Before swapping: "+"a: "+a+" b: "+b+" c: "+c);
        //a=33, b=11, c=22
        int temp=c;
        c=b;
        b=a;
        a=temp;
        System.out.println("After swapping: "+"a: "+a+" b: "+b+" c: "+c);

    }
}
