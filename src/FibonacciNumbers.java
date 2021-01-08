import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input number:");
        int n = in.nextInt();
        System.out.println("Fibonacci number is " + fib(n));
    }

    public static long fib(int n) {
        long arr[] = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n];
    }
}


