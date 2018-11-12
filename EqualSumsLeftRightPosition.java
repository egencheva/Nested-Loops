import java.util.Scanner;

public class EqualSumsLeftRightPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = n1; i <= n2; i++) {
            int num = i;
            int left1 = num % 10;
            num /= 10;
            int left2 = num % 10;
            num /= 10;
            int center = num % 10;
            num /= 10;
            int right1 = num % 10;
            num /= 10;
            int right2 = num % 10;
            num /= 10;

            leftSum = left1 + left2;
            rightSum = right1 + right2;

            if (leftSum == rightSum) {
                System.out.printf("%d ",i);
            } else if (leftSum < rightSum) {
                leftSum += center;
                if (leftSum == rightSum) {
                    System.out.printf("%d ",i);
                }
            } else if (leftSum > rightSum) {
                rightSum += center;
                if (leftSum == rightSum) {
                    System.out.printf("%d ",i);
                }

            }
        }
    }
}