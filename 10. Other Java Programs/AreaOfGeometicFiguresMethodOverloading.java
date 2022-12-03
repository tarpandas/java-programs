public class AreaOfGeometicFiguresMethodOverloading {
    static double area(int length, int breadth) {
        return (double) length * breadth;
    }
    static double area(int side) {
        return (double) Math.pow(side, 2);
    }
    static double area(double radius) {
        final double PI = 3.14159;
        return (double) PI * Math.pow(radius,2) ;
    }
    static double area(double height, double base) {
        return (double) height * base * 0.5;
    }
    public static void main(String[] args) {
        System.out.println("Area of a rectangle with length 2 and breadth 3 = "+ area(2,3) +" sq. units");
        System.out.println("Area of a square with side length 2= "+ area(2)+" sq. units");
        System.out.println("Area of a circle with radius 7 = "+ area(7.0)+" sq. units");
        System.out.println("Area of a triangle with height 2 and base length 3 = "+ area(2.0,3.0)+" sq. units");
    }
}
