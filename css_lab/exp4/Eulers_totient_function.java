import java.util.ArrayList;
import java.util.Scanner;

class Eulers_totient_function {

    // no need ..... just testing
    // static int[][] dp;
    // static int wrap_gcd(int i, int n) {
    //     if(dp[i][n] != 0)
    //         return dp[i][n];

    //     dp[i][n] = gcd(i, n);
    //     return dp[i][n];
    // }

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

    // main logic to check
	static int phi(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        // int res = 1;
        // for (int i = 2; i < n; ++i) {
		for (int i = 1; i <= n; ++i) {
			if (gcd(i, n) == 1) {
                arr.add(i);
                // ++res;
            }
        }
        System.out.println(arr);
		return arr.size();
        // return res;
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
		int input = scan.nextInt();
        scan.close();

        // dp = new int[input+1][input+1];

		for (int i = 1; i <= input; ++i) {
			System.out.println(phi(i) + " = phi(" + i + ")\n");
        }
	}
}

