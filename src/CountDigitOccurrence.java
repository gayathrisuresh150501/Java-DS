import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long num = input.nextLong();

        System.out.println("Enter the digit to be counted: ");
        int digit = input.nextInt();

        int count = 0;

        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Occurrences: " + count);
    }

}
