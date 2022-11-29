class AreaOfRectangle {
    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle: "+ (length * breadth));
    }
}
class AreaOfSquare {
    public void area(int sides) {
        System.out.println("Area of square: "+ (sides * sides));
    }
}
class AreaOfTriangle {
    public void area(int base, int height) {
        System.out.println("Area of Traiangle: "+ (base * height * 0.5));
    }
}
public class AreaOfPolygons {
    public static void main(String[] args) {
        AreaOfRectangle rect1 = new AreaOfRectangle();
        AreaOfSquare square1 = new AreaOfSquare();
        AreaOfTriangle tri1 = new AreaOfTriangle();

        rect1.area(11,4);
        square1.area(20);
        tri1.area(15,20);
    }
}
