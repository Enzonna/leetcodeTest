package threadTest;

/*
    在多线程实验中不要在junit中测试
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                clear();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                shaDu();
            }
        }).start();

    }

    public static void clear(){
        for (int i = 0; i < 50; i++) {
            System.out.println("垃圾清理中===......." + i);
        }
    }

    public static void shaDu(){
        for (int i = 0; i < 50; i++) {
            System.out.println("杀毒中......." + i);
        }
    }
}
