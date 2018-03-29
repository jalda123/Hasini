import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number to verify given number is prime or not");

		try {

			int n = Integer.parseInt(br.readLine());

			int factor = 0;

			for (int i = 2; i <= n; i++) {

				if (n % i == 0) {

					factor = factor + 1;
				}
			}

			if (factor == 1) {
				System.out.println("Given number is prime");
			} else {
				System.out.println("Given number is not a prime");
			}
		}

		catch (Exception e) {

		}

	}

}
