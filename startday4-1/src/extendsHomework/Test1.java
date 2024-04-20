package extendsHomework;

/**
 * Package: extendsHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月16日 14:01
 */
public class Test1 {
    public static void main(String[] args) {
//        Person p = new Person("张三",23,'男');
//        System.out.println(p);
//
//        Student s = new Student("王浩",20,'男',90);
//        System.out.println(s);
//
//        Teacher t = new Teacher("宋红康",36,'男',50000);
//        System.out.println(t);
        DepositCard d = new DepositCard("11111",500);
        System.out.println("初始情况：" + d);

        d.withdraw(200);
        System.out.println("取款200后：" + d);

        d.save(100);
        System.out.println("存款100后：" + d);

        d.save(-100);
        System.out.println("存款-100后：" + d);

        d.withdraw(-100);
        System.out.println("取款-100后：" + d);

        d.withdraw(500);
        System.out.println("取款500后：" + d);
    }


}
