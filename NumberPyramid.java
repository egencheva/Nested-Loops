import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        int counter = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
                counter++;
                if (counter == n) {
                    return;
                }
            }
            System.out.println();
        }

    }
}
