import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		int flooredB = (int) b;
		System.out.printf("a = %d, b = %f, flooredB = %d\n", a, b, flooredB);
		if (a < 0 || b < 0) return;
		// print a to the power of b
		System.out.printf("a^b: %g\n", Math.pow(a,b));

		// print gcd(a, floor(b))
		System.out.printf("gcd(a, floor(b)): %d\n", findGcd(a, flooredB));
		// get smallest fibonaaci number greater than a
		/* String result = "[";
		for (int res: getFibNums(a, flooredB)) {
			result += res;
			result += ", ";
		}
		result = result.substring(0, result.length() - 2);
		result += "]\n";
		System.out.println(result);
		*/
		System.out.println(Arrays.toString(getFibNums(a, flooredB)));	
	}
	
	static int findGcd(int a, int flooredB) {
		// get gcd
		int smallerNumber = a < flooredB ? a : flooredB;
		int gcd = 1;
		for (int i = 2; i <= smallerNumber; ++i) {
			if (a % i == 0 && flooredB % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	static int[] getFibNums(int a, int flooredB) {
		int[] result = new int[flooredB];
		int i = 0;
		while (i < flooredB) {
			if (isFibonacci(a)) {
				result[i++] = a;
			}
			a++;
		}
		return result;
	}

	static boolean isFibonacci(int n) {
		return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
	}

	static boolean isPerfectSquare(int n) {
		int sqrt = (int)Math.sqrt(n);
		return sqrt*sqrt == n;
	}
}
