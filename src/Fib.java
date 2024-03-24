import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            count++;
            a = temp;
        }

        System.out.println("nth fibonacci number is: " + b);
    }
}