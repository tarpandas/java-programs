public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        int radius = 10;
        final double PI = 3.141593;

        System.out.println("Radius: "+ radius+" cm");
        System.out.printf("Circumference: %3.2f cm\n",(2*PI*radius));
        System.out.printf("Area: %3.2f cm2\n",(PI*Math.sqrt(radius)));
    }
}
