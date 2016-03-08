class TwoDShape {
    private double width;
    private double height;

    // Default Constructor
    TwoDShape() {
        width = height = 0.0;
    }

    // Construct object with equal width and height
    TwoDShape(double x) {
        width = height = x;
    }
    TwoDShape(double w, double h) {
        width = w;
        height = w;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }

    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
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
        super(w, h);

        style = s;
    }

    // one argument constructor
    Triangle(double x) {
        super(x); // calls superclass constructor
        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() /2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
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