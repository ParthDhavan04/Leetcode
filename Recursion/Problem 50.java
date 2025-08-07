class Solution {
    public double myPow(double x, int n) {
        // Convert n to long to handle Integer.MIN_VALUE safely
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    // Recursive helper function with long exponent
    private double fastPow(double x, long n) {
        if (n == 0) return 1;

        double half = fastPow(x, n / 2);
        double result = half * half;

        if (n % 2 == 1) {
            result *= x;
        }

        return result;
    }
}
