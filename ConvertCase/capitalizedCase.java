package ConvertCase;

public class capitalizedCase {
    static String capitalize(String str)
    {
        str=str.toLowerCase();
        String res="";
        res+=(char)(str.charAt(0)-32);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)==' ')
            {
                res+=(char)(str.charAt(i)-32);
            }
            else{
                res+=(str.charAt(i));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="my name is chandana";
        System.out.println("Capitalized case");
        System.out.println(capitalize(str));
    }
}
