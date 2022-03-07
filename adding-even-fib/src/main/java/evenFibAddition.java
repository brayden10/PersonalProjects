public class evenFibAddition {

	public static void main(String[] args) {
		long evenFibs = 0;
		long[] fibList = new long[50];
		fibList[0] = 1; // must provide starting fib numbers
		fibList[1] = 2;
		fibList = makeFibList(fibList);
		evenFibs = getSumOfFib(fibList);
		System.out.println(evenFibs); // return sum of all even fibs
	}

	public static long[] makeFibList(long[] fibList) {
		int i = 2;
		while (fibList[i - 1] < 3000000) { // provide the max fib number > 4mil I am using 3mil to not get a fib bigger
											// then 4mil
			fibList[i] += fibList[i - 2] + fibList[i - 1];
			i++;
		}
		return fibList;
	}

	public static long getSumOfFib(long[] b) {
		int i = 1;
		long sum = 0;
		while (i < b.length) {
			if (b[i] % 2 == 0) {
				sum = b[i] + sum;
			}
			i++;
		}
		return sum;
	}

}
