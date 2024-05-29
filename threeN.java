public class threeN {
    public static void main(String[] args) {
        int input = 22;
        while (input > 0) {
            System.out.println(input);
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = 3 * input + 1;
            }
            if (input == 1) {
                System.out.println(input);
                break;
            }
        }
    }
}
