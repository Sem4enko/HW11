import java.util.concurrent.RecursiveTask;

public class FibonacciNumbers extends RecursiveTask<Long> {
    private long fib;

    public FibonacciNumbers(long fib) {
        this.fib = fib;
    }

    @Override
    protected Long compute() {
        if (fib <= 0) {
            return fib;
        } else {
            FibonacciNumbers f1 = new FibonacciNumbers(fib - 1);
            f1.fork();
            FibonacciNumbers f2 = new FibonacciNumbers(fib - 2);
            return f1.join() + f2.compute();
        }
    }
}



