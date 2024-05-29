import java.util.Scanner;

public class Hartals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days (N):");
        int N = scanner.nextInt();
        
        System.out.println("Enter the number of political parties:");
        int P = scanner.nextInt();
        
        int[] hartalParams = new int[P];
        System.out.println("Enter the hartal parameters (strike intervals) for each party:");
        for (int i = 0; i < P; i++) {
            hartalParams[i] = scanner.nextInt();
        }

        boolean[] daysLost = new boolean[N + 1]; // Array to track lost days (1-based indexing)

        for (int i = 0; i < P; i++) {
            int hartal = hartalParams[i];
            for (int day = hartal; day <= N; day += hartal) {
                if (day % 7 != 6 && day % 7 != 0) { // Avoid Fridays (6th day) and Saturdays (7th day)
                    daysLost[day] = true;
                }
            }
        }

        int lostDaysCount = 0;
        for (int day = 1; day <= N; day++) {
            if (daysLost[day]) {
                lostDaysCount++;
            }
        }

        System.out.println("Total number of lost working days: " + lostDaysCount);
    }
}
 
    

