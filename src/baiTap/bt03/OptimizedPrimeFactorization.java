package baiTap.bt03;

import java.util.ArrayList;
import java.util.List;

public class OptimizedPrimeFactorization implements Runnable {
    private int limit;

    public OptimizedPrimeFactorization(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization đang chạy...");
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
                System.out.println("OptimizedPrimeFactorization tìm thấy số nguyên tố: " + i);
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
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}