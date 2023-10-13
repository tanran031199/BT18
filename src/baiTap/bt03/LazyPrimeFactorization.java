package baiTap.bt03;

import java.util.ArrayList;
import java.util.List;

public class LazyPrimeFactorization implements Runnable {
    private int limit;

    public LazyPrimeFactorization(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization đang chạy...");
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
                System.out.println("LazyPrimeFactorization tìm thấy số nguyên tố: " + i);
                System.out.println();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
