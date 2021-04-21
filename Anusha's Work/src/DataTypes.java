

public class DataTypes {
    public static void main(String[] args) {
        //-128 to 127
        byte b=15;
        //-32768 to 32767
        short  s=20;
        //-2^31 to 2^31-1
        int i=10;
        //-2^63 to 2^63-1
        long l=254178L;
        // single precision 32 bit
        float f= 656.34f;
        // double precison 64 bit
        double d= 76.34343d;
        //type conversion
        int a=(int)(d);
        short s1=(short)(f);

        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        System.out.println(a);
        System.out.println(s1);
    }

}
