package GLAB303_10_4;

public class Rectangle extends Shape implements Movable {
    private int x, y;

    public Rectangle() {
    }

    public Rectangle(String color) {
        this.color = color;
    }

    public Rectangle(int x, int y, double width, double height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
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