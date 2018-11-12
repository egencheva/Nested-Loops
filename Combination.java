import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
//x1+x2+x3+x4+x5=n
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    for (int l = 0; l <= n; l++) {
                        for (int m = 0; m <= n; m++) {
                            int sum = i + j + k + l + m;
                            if (sum == n) {
                                count++;
                            }

                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}

