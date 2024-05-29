import java.util.Scanner;

public class WertuProblem {
    public static void main(String[] args) {
        // Define the original and mapped keyboard layouts
        String qwerty = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String wertu =  "WERTYUIOPQSDFGHJKLAXCVBNMZ";

        // Create arrays for the original and mapped keyboard layouts
        char[] qwertyArray = qwerty.toCharArray();
        char[] wertuArray = wertu.toCharArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be remapped:");
        String input = scanner.nextLine().toUpperCase();

        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            int index = findIndex(qwertyArray, c);
            if (index != -1) {
                output.append(wertuArray[index]);
            } else {
                output.append(c); // Leave character unchanged if not in the map
            }
        }

        System.out.println("Remapped string:");
        System.out.println(output.toString());
    }

    // Helper method to find the index of a character in an array
    private static int findIndex(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Character not found
    }
}
