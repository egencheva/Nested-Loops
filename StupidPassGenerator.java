import java.util.Scanner;

public class StupidPassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1; j++) {
                for (char k = 'a'; k < 'a' + n2; k++) {
                    for (char m = 'a'; m < 'a' + n2; m++) {
                        for (int o = 1; o <= n1; o++)
                            if (o > i && o > j) {
                                System.out.printf("" + i + j + k + m + o+" ");
                            }
                    }
                }
            }
        }

    }
}
