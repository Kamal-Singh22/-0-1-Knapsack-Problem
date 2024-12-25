# -0-1-Knapsack-Problem
 0/1 Knapsack Problem
How it Works:
Input:
The user provides the number of items, their weights, values, and the knapsack's capacity.
DP Table:
A 2D array dp[i][w] is used to store the maximum value obtainable with the first i items and capacity w.
If the current item's weight exceeds the capacity, the item is skipped.
Otherwise, the item is either included or excluded to maximize value.
Output:
The maximum value obtainable is printed.
