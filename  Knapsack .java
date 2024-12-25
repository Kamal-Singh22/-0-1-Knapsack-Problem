import java.util.*;

public class Knapsack {
    public static int knapsack(int[] weights, int[] values, int W) {
        int n = values.length;
        int[][] dp = new int[n + 1][W + 1];

        // Build the dp table
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        System.out.println("Enter weights of items:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.println("Enter values of items:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.print("Enter capacity of knapsack: ");
        int W = scanner.nextInt();

        int maxValue = knapsack(weights, values, W);
        System.out.println("Maximum value in the knapsack: " + maxValue);

        scanner.close();
    }
}
