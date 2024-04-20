package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月17日 10:38
 */
public class Rectangle extends Graphic {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + "长和宽为" + length + width;
    }
}

