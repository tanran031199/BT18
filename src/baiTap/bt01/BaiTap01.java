package baiTap.bt01;

public class BaiTap01 {
    public static void main(String[] args) {
        NumberGenerator obj1 = new NumberGenerator();
        NumberGenerator obj2 = new NumberGenerator();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("1");
        t2.setName("2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
