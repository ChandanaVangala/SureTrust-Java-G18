package Swapping;

public class SwapThree2 {
    public static void main(String args[])
    {
        int a=11,b=22,c=33;
        System.out.println("Before swapping:");
        System.out.println("a= "+a+" b= "+b+" c= "+c);
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("After swapping:");
        System.out.println("a= "+a+" b= "+b+" c= "+c);

    }
}
