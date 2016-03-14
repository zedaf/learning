import org.w3c.dom.css.Rect;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Default Constructor
    TwoDShape() {
        width = height = 0.0;
    }

    // Construct object with equal width and height
    TwoDShape(double x, String n) {
        width = height = x;
        name = "none";
    }
    TwoDShape(double w, double h, String n) {
        width = w;
        height = w;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    // area() is now abstract
    abstract double area();
}

// subclass of TwoDShape for triangles
class Triangle extends TwoDShape {
    private String style;

    // default constructor
    Triangle() {
        super();
        style = "none";
    }
    //Constructor
    Triangle(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // one argument constructor
    Triangle(double x) {
        super(x, "triangle"); // calls superclass constructor
        style = "filled";
    }

    // Construct object from an object
    Triangle(Triangle ob) {
        super(ob); // pass object to TwoDShape
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() /2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends TwoDShape {
    // A default constructor
    Rectangle() {
        super();
    }

    //Constructor for rectangle
    Rectangle(double w, double h) {
        super(w, h, "rectangle"); // call superclass constructor
    }

    //construct a square
    Rectangle(double x) {
        super(x, "rectangle"); // call superclass constructor
    }

    //construct an object from an object
    Rectangle(Rectangle ob) {
        super(ob); //pass obj to TwoDShape constructor
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class DemoInheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);

        t1 = t2;

        t1.setWidth(4.0);
        t1.setHeight(4.0);

        t2.setWidth(8.0);
        t2.setHeight(12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }
}