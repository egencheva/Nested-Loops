import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.print("" + i + "");
            }
            for (int j = 1; j <= 9; j++) {
                if (number % j == 0) {
                    System.out.print("" + j + "");
                }
                for (int k = 01; k <= 9; k++) {

                }
            }
        }
    }
}