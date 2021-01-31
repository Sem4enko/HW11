import java.util.concurrent.ForkJoinPool;

public class Main {
    ForkJoinPool fj = ForkJoinPool.commonPool();
    FibonacciNumbers fibonacciNumbers = new FibonacciNumbers(50);

    Long output = -(fj.invoke(fibonacciNumbers));
    System.out.println(output);
}
