package extendsHomework;

/**
 * Package: extendsHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��16�� 14:01
 */
public class Test1 {
    public static void main(String[] args) {
//        Person p = new Person("����",23,'��');
//        System.out.println(p);
//
//        Student s = new Student("����",20,'��',90);
//        System.out.println(s);
//
//        Teacher t = new Teacher("�κ쿵",36,'��',50000);
//        System.out.println(t);
        DepositCard d = new DepositCard("11111",500);
        System.out.println("��ʼ�����" + d);

        d.withdraw(200);
        System.out.println("ȡ��200��" + d);

        d.save(100);
        System.out.println("���100��" + d);

        d.save(-100);
        System.out.println("���-100��" + d);

        d.withdraw(-100);
        System.out.println("ȡ��-100��" + d);

        d.withdraw(500);
        System.out.println("ȡ��500��" + d);
    }


}
