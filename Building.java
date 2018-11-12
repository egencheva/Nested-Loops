import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < rooms; j++) {

                if (i == floors) {
                    System.out.print("L");
                } else if (i % 2 != 0) {
                    System.out.print("A");
                } else {
                    System.out.print("O");
                }
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }

    }
}
