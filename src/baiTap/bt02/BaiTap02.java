package baiTap.bt02;

public class BaiTap02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();

        t1.start();
        t1.join();
        t2.start();
    }
}