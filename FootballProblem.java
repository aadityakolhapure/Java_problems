import java.util.Scanner;

public class FootballProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of goals scored by Team A:");
        int goalsA = scanner.nextInt();

        System.out.println("Enter the number of goals scored by Team B:");
        int goalsB = scanner.nextInt();

        String result = determineWinner(goalsA, goalsB);

        System.out.println("Result: " + result);
    }

    public static String determineWinner(int goalsA, int goalsB) {
        if (goalsA > goalsB) {
            return "Team A wins!";
        } else if (goalsB > goalsA) {
            return "Team B wins!";
        } else {
            return "It's a draw!";
        }
    }
}

