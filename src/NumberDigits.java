import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, remainder;
        int sum = 0;

        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        while (number > 0) {
            remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        System.out.println("The sum of the digits of the number: " + sum);
    }
}
