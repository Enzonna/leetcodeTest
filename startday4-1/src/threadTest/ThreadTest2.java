package threadTest;

/*
    在java中创建多线程的方式：
        方式一 ：继承Thread
        方式二 ：实现Runnable接口


    方式一 ：继承Thread
        1.自定义一个类并继承Thread类
        2.重写run方法
        3.在run方法中实现需要在分线程执行的功能
        4.创建自定义类的对象
 */
public class ThreadTest2 {
    /*
        调用main方法的线程叫作主线程或main线程
     */
    public static void main(String[] args) {
        //4.创建自定义类的对象
        MyThread mt = new MyThread();
        //5.调用start方法 开启分线程
        mt.start();//做了两件事①开启分线程 ②调用run方法


        System.out.println("============================开启第二个分线程=======================");
        //再创建一次Thread子类的对象
        MyThread mt2 = new MyThread();
        mt2.start(); //mt2和mt 这两个线程调用的MyThread中的run方法。

        System.out.println("============================开启第二个分线程=======================");
        //再创建一次Thread子类的对象
        MyThread2 mt3 = new MyThread2();
        mt3.start(); // mt的分线程调用的是MyThread中的run方法  mt3的分线程调用的是MyThread2中的run方法

        for (int i = 0; i < 50; i++) {
            /*
                Thread.currentThread() : 获取当前线程
                getName() ：获取线程的名字
             */

            System.out.println(Thread.currentThread().getName() + "===在main线程中......" + i);
        }
    }
}
//1.自定义一个类并继承Thread类
class MyThread extends Thread{
    //2.重写run方法
    @Override
    public void run() {
        //3.在run方法中实现需要在分线程执行的功能
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "===清理垃圾中......" + i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {

    }
}
