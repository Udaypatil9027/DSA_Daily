import java.util.Scanner;

public class Q06_InvertedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int minDigit = 9;
        int maxDigit = 0;
        int temp = num;

        boolean[] seen = new boolean[10]; // For digits 0-9
        int[] positionArr = new int[10];  // Store position of digits (for inversion)
        int position = 1;

        while (temp != 0) {
            int digit = temp % 10;

            if (seen[digit]) {
                System.out.println("Duplicate Digit Found: " + digit);
                return;
            }

            seen[digit] = true;
            positionArr[digit] = position;

            if (digit < minDigit) {
                minDigit = digit;
            }
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            temp /= 10;
            position++;
        }

        // Check if all digits from min to max are present
        for (int i = minDigit; i <= maxDigit; i++) {
            if (!seen[i]) {
                System.out.println("Missing Digit: " + i);
                return;
            }
        }

        // All checks passed
        System.out.print("Inverted Number: ");
        for (int i = minDigit; i <= maxDigit; i++) {
            System.out.print(positionArr[i]);
        }
    }
}
