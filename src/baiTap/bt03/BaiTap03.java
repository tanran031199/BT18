package baiTap.bt03;

public class BaiTap03 {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(100);
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(100);

        Thread t1 = new Thread(optimizedPrimeFactorization);
        Thread t2 = new Thread(lazyPrimeFactorization);

        t1.start();
        t2.start();
    }
}



