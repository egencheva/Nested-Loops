import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String numStr = Integer.toString(num);
        int lastNum = num;

        for (int i = 0; i < numStr.length(); i++) {
            int number = lastNum % 10;
            int lastDigit = (lastNum - number) / 10;
            lastNum = lastDigit;
            if (number == 0) {
                System.out.print("ZERO");
            }
            for (int j = 0; j < number; j++) {
                int asciiN = number + 33;
                char symbol = (char) asciiN;
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}


