import java.util.ArrayList;
import java.util.List;

public class findallfactors {
    static void findFactors(int n) {
        List<Integer> factors = new ArrayList<>(); // to store factors of n
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) { // to avoid duplicates
                    factors.add(n / i);
                }
            }
        }
        // print factors
        for (Integer i : factors) {
            System.out.print(factors.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N1 = 100, N2 = 900;
        System.out.print("Factors of " + N1 + " are: ");
        findFactors(N1);
        System.out.print("Factors of " + N2 + " are: ");
        findFactors(N2);
    }
}
