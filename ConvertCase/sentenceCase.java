package ConvertCase;

public class sentenceCase {
    static String sentence(String str)
    {
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        String str="my name is chandana";
        System.out.println("Sentence case: ");
        System.out.println(sentence(str));
    }
}
