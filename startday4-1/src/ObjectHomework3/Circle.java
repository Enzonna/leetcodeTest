package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ17ÈÕ 10:36
 */
public class Circle extends Graphic {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "°ë¾¶" + radius;
    }
}
