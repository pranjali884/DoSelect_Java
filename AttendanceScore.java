package doSelect;

import java.util.Scanner;

import java.util.Scanner;

public class AttendanceScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totalWays = calculateTotalWays(n);
        System.out.println("Total number of ways: " + totalWays);
    }

    private static int calculateTotalWays(int n) {
        final int MOD = (int) 1e9 + 7;
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1;
        dp[1] = 2;

        if (n >= 2) {
            dp[2] = 3;
            for (int i = 3; i <= n; i++) {
                dp[i] = (3 * dp[i-1]) % MOD;
            }
        }

        return dp[n];
    }
}
