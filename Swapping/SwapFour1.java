package Swapping;

public class SwapFour1 {
    public static void main(String[] args) {
        int a=11,b=22,c=33,d=44;
        System.out.println("Before swapping:");
        System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
        a=a+b+c+d;
        b=a-(b+c+d);
        c=a-(b+c+d);
        d=a-(b+c+d);
        a=a-(b+c+d);
        System.out.println("After swapping:");
        System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
    }
}
