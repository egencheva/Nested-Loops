import java.util.Scanner;

public class EqualSumEvenOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = num1; i <= num2; i++) {
            int num = i;
            int n6 = num % 10;
            num /= 10;
            int n5 = num % 10;
            num /= 10;
            int n4 = num % 10;
            num /= 10;
            int n3 = num % 10;
            num /= 10;
            int n2 = num % 10;
            num /= 10;
            int n1 = num % 10;
            num /= 10;

            evenSum = n6 + n4 + n2;
            oddSum = n5 + n3 + n1;
            if (evenSum == oddSum) {
                System.out.printf("%d ",i);
            }
        }
    }
}
