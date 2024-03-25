import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        long num = input.nextLong();
        System.out.println("Number: " + num);
        long newNum = 0;
        while (num > 0) {
            newNum = newNum * 10 + (num % 10);
            num /= 10;
        }

        System.out.println("Reverse: " + newNum);
    }
}
