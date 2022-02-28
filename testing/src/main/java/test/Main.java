package test;

class Main {

	public static void main(String args[]) {
		long tn = 0, n = 0, b = 1;

		while (n < 500) {
			tn = getTriangleNumber(b);
			b++;
			n = getNumberOfDivisors(tn);
		}
		System.out.println(tn);
	}

	public static long getNumberOfDivisors(long n) {
		int ret = 1;
		long factor = 2;
		while (factor <= n) {
			int temp = 1;
			while (n % factor == 0) {
				n /= factor;
				temp++;
			}
			ret *= temp;
			factor++;
		}
		return ret;
	}

	public static long getTriangleNumber(long b) {
		long i = 1, sum = 0;
		while (i <= b) {
			sum += i;
			i++;
		}
		return sum;
	}
}