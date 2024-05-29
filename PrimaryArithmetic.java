import java.util.Scanner;

public class PrimaryArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two non-negative integers (0 to exit):");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        while (num1 != 0 || num2 != 0) {
            int carries = countCarries(num1, num2);
            if (carries == 0) {
                System.out.println("No carry operation.");
            } else if (carries == 1) {
                System.out.println("1 carry operation.");
            } else {
                System.out.println(carries + " carry operations.");
            }

            System.out.println("Enter two non-negative integers (0 to exit):");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }
    }

    public static int countCarries(int num1, int num2) {
        int carries = 0;
        int carry = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int sum = digit1 + digit2 + carry;

            if (sum >= 10) {
                carries++;
                carry = 1;
            } else {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        return carries;
    }
}
 
