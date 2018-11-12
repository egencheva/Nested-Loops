import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int sumSymbol = 0;
        int maxSymbol = 0;
        String maxName = "";

        while (!name.equals("STOP")) {
            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                sumSymbol = sumSymbol+symbol;

            }
            if (sumSymbol > maxSymbol) {
                maxSymbol = sumSymbol;
                maxName = name;
            }
            name = scanner.nextLine();
            sumSymbol=0;
        }
        System.out.printf("Winner is %s - %d!", maxName, maxSymbol);

    }
}
