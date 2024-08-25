public class Fibonacci {

    /**
     * calculates the nth term in the Fibonacci sequence.
     *
     * @param n the term in the Fibonacci sequence to calculate
     * @return the nth Fibonacci term
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Term to find
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
