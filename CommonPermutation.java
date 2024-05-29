import java.util.Arrays;
import java.util.Scanner;

public class CommonPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        String common = findCommonCharacters(str1, str2);

        System.out.println("Common characters in sorted order:");
        System.out.println(common);
    }

    private static String findCommonCharacters(String str1, String str2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count occurrences of each character in the first string
        for (char c : str1.toCharArray()) {
            if (Character.isLetter(c)) {
                count1[Character.toLowerCase(c) - 'a']++;
            }
        }

        // Count occurrences of each character in the second string
        for (char c : str2.toCharArray()) {
            if (Character.isLetter(c)) {
                count2[Character.toLowerCase(c) - 'a']++;
            }
        }

        // Find common characters and build the result
        StringBuilder commonChars = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int commonCount = Math.min(count1[i], count2[i]);
            for (int j = 0; j < commonCount; j++) {
                commonChars.append((char) (i + 'a'));
            }
        }

        return commonChars.toString();
    }
}
 