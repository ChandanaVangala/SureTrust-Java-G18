package ConvertCase;

public class alternatingCase {
    static String alternate(String str)
    {
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                if(str.charAt(i)>=65 && str.charAt(i)<=90)
                {
                    res+=(char)(str.charAt(i)+32);
                }
                else
                {
                    res+=str.charAt(i);
                }
            }
            else
            {
                if(str.charAt(i)>=97 && str.charAt(i)<=122)
                {
                    res+=(char)(str.charAt(i)-32);
                }
                else{
                    res+=str.charAt(i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="my name is chandana";
        System.out.println(alternate(str));
    }
}
