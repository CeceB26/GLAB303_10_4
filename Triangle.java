package GLAB303_10_4;

public class Triangle extends Shape implements Movable {
    private int x, y;

    public Triangle() {
    }

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(int x, int y, double base, double height, String color) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle");
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

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
