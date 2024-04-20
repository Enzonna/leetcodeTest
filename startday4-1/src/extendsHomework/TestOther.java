package extendsHomework;

/**
 * Package: extendsHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ16ÈÕ 14:17
 */
public class TestOther {
    public static void main(String[] args) {
        Other o = new Other();
        new TestOther().addOne(o);
        System.out.println(o.i);
    }

    public void addOne(final Other o){
        o.i++;
    }
}
class Other{
    public int i;
}