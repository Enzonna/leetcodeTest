package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ17ÈÕ 10:40
 */
public class Test1 {
    public static void main(String[] args) {

        Graphic[] shapes = new Graphic[4];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Circle(1.5);
        shapes[2] = new Rectangle(5,1);
        shapes[3] = new Rectangle(4,2);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

    }
}
