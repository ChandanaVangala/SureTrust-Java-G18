class Representations {
    public static void main(String[] args) {
        //Binary representation
        int bin = 0b1010;
        int bin1=0B1010;
        System.out.println(bin);
        System.out.println(bin1);
        System.out.println(Integer.toBinaryString(bin1));

        //Octal repesentation
        int oct=012;
        System.out.println(oct);
        System.out.println(Integer.toOctalString(oct));

        //Hexadecimal representation
        int hex=0x2A;
        System.out.println(hex);
        System.out.println(Integer.toHexString(hex));

        //converting an integer into different number formats
        System.out.println(Integer.parseInt("1010",2));
        System.out.println(Integer.parseInt("F",16));
        System.out.println(Integer.parseInt("111",8));

    }
}