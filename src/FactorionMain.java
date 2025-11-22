import java.util.Scanner;

public class FactorionMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int low = sc.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int high = sc.nextInt();

        System.out.println("Factorion numbers in the range:");

        boolean found = false;

        for (int i = low; i <= high; i++) {
            if (FactorionUtil.isFactorion(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No factorion numbers found in the given range.");
        }

        sc.close();
    }
}

