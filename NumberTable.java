import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int num = row + col -1;
                if (num <= n) {
                    System.out.print(num+ "");

                } else {
                    num=2*n-1;
                    System.out.println(num+ "");
                }
            }
        }
    }
}

