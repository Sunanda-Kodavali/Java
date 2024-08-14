package dci.j24e01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> primes = getPrimeNumbers(15);
        System.out.println("The first 15 prime numbers are:");
        System.out.println(primes);
    }

    public static List<Integer> getPrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primeNumbers.add(number);
                count++;
            }
            number++;
        }

        return primeNumbers;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
