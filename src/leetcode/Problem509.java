package leetcode;
import java.util.Arrays;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 */
class Problem509
{
    public int fib(int N) {
        if (N == 1 ) {
            return 1;
        }
        if (N == 0 ) {
            return 0;
        }
        return fib(N-1) + fib(N-2);
    }

    public static void main(String[] args) {
        Problem509 solution = new Problem509();
        int ret = solution.fib(3);
        System.out.println(ret);
    }

}