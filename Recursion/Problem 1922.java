class Solution {
    // Large prime number to avoid overflow in result (as per problem constraint)
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        // Count of digits at even indices (0-based)
        long evenCount = (n + 1) / 2;

        // Count of digits at odd indices
        long oddCount = n / 2;

        // Compute 5^evenCount % MOD using modular exponentiation
        long evenWays = modPowRecursive(5, evenCount);

        // Compute 4^oddCount % MOD using modular exponentiation
        long oddWays = modPowRecursive(4, oddCount);

        // Total good numbers = (evenWays * oddWays) % MOD
        return (int) ((evenWays * oddWays) % MOD);
    }

    // Recursive modular exponentiation to compute (base^exp % MOD)
    private long modPowRecursive(long base, long exp) {
        // Base case: any number to the power 0 is 1
        if (exp == 0) return 1;

        // Recursively compute half power
        long half = modPowRecursive(base, exp / 2);

        // Square the half result (base^(exp/2) * base^(exp/2))
        long result = (half * half) % MOD;

        // If exponent is odd, multiply one more base
        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}
