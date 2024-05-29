import java.util.Scanner;

public class JollyJumper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the sequence:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The sequence must contain at least one element.");
            return;
        }

        int[] sequence = new int[n];
        System.out.println("Enter the sequence of integers:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        if (isJollyJumper(sequence)) {
            System.out.println("The sequence is a Jolly Jumper.");
        } else {
            System.out.println("The sequence is not a Jolly Jumper.");
        }
    }

    public static boolean isJollyJumper(int[] sequence) {
        int n = sequence.length;
        if (n == 1) {
            return true; // A single element sequence is trivially a Jolly Jumper
        }

        boolean[] seen = new boolean[n];
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(sequence[i] - sequence[i - 1]);
            if (diff >= 1 && diff < n && !seen[diff]) {
                seen[diff] = true;
            } else {
                return false;
            }
        }

        // Check if all differences from 1 to n-1 are seen
        for (int i = 1; i < n; i++) {
            if (!seen[i]) {
                return false;
            }
        }

        return true;
    }
}
