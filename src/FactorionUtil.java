public class FactorionUtil {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static boolean isFactorion(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += factorial(d);
            n /= 10;
        }

        return sum == original;
    }
}

