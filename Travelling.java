import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();


        while (!destination.equals("End")) {
            double allSum = 0.0;
            double budget = Double.parseDouble(scanner.nextLine());

            while (allSum < budget) {
                double sum = Double.parseDouble(scanner.nextLine());
                allSum += sum;

            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}

