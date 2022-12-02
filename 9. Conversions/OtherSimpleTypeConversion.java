public class OtherSimpleTypeConversion {
    public static void main(String[] args) {
        // long to int
        long l = 122314;
        int i = (int)l;

        System.out.println(i);

        // int to long
        i = 3454;
        l = i;

        System.out.println(l);

        // int to double
        i = 5436;
        double d = i;

        System.out.println(d);

        // double to int
        d = 45536.564;
        i = (int)d;

        System.out.println(i);

        // String to int
        String str = "5464";
        i = Integer.parseInt(str);

        System.out.println(i);

        // int to String
        i = 45364;
        str = Integer.toString(i);

        System.out.println(str);

        // String to double
        str = "45343";
        d = Double.parseDouble(str);

        System.out.println(d);

        // double to String
        d = 46456.6465;
        str = Double.toString(d);

        System.out.println(str);

        // String to long
        str = "453643455";
        l = (long) Integer.parseInt(str);

        System.out.println(l);

        // long to String
        l = 1112333211;
        str = Long.toString(l);

        System.out.println(str);

        // String to boolean
        str = "true";
        boolean bool = Boolean.parseBoolean(str);

        System.out.println(bool);

        // boolean to String
        bool = false;
        str = Boolean.toString(bool);

        System.out.println(str);

        // String to float
        str = "45345.35f";
        float f = Float.parseFloat(str);

        System.out.println(f);

        // float to String
        f = 345345.43f;
        str = Float.toString(f);

        System.out.println(str);
    }
}
