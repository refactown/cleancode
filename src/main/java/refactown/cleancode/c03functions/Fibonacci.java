package refactown.cleancode.c03functions;

public class Fibonacci {

	public static int fib(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		return fib(x - 1) + fib(x - 2);
	}

	public static String seq(int x) {
		if (x == 0) {
			return "0";
		}
		return "" + seq(x - 1) + "," + fib(x);
	}
}
