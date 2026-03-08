package GLAB303_10_4;

public class Circle extends Shape implements Movable {
    protected double radius;
    private int x, y;
    private final double PI = Math.PI;

    /** Constructs a Circle instance at the given x and y */
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double getArea() {
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "] ";
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    // Coded to match the sample output
    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}

