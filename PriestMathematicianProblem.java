public class PriestMathematicianProblem {
    public static void main(String[] args) {
        int mathematicianAge = findMathematicianAge();
        System.out.println("The mathematician is " + mathematicianAge + " years old.");
    }

    public static int findMathematicianAge() {
        for (int age = 1; age <= 120; age++) {
            if (age + 6 == age * age && age + 6 == 3 * age) {
                return age;
            }
        }
        return -1; // If no valid age is found (unlikely in this problem)
    }
}
 