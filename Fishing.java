import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quota = Integer.parseInt(scanner.nextLine());
        String fish = scanner.nextLine();
        double kg = 0.0;
        double ttlIncome = 0.0;
        int count = 0;
        double sumSymbol = 0.0;
        double income = 0.0;
        double tax = 0.0;
        double taxPerFish = 0.0;
        double ttlTax = 0.0;

        while (!fish.equals("Stop")) {
            count++;
            kg = Double.parseDouble(scanner.nextLine());
            if (count % 3 == 0) {
                for (int i = 0; i < fish.length(); i++) {
                    char symbol = fish.charAt(i);
                    income += symbol;
                }
                income = income / kg;
                ttlIncome = ttlIncome + income;
            } else {
                for (int i = 0; i < fish.length(); i++) {
                    char symbol = fish.charAt(i);
                    tax += symbol;
                }
                taxPerFish = tax / kg;
                ttlTax = ttlTax + taxPerFish;
                income = income / kg;
            }
            if (count < quota) {
                tax = 0;
                income = 0;
                fish = scanner.nextLine();
            } else {
                break;
            }
        }
        if (count == quota) {
            System.out.println("Lyubo fulfilled the quota!");
        }
        if (ttlIncome > ttlTax) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", count, ttlIncome - ttlTax);
        } else if (ttlIncome < ttlTax){
            System.out.printf("Lyubo lost %.2f leva today.", Math.abs(ttlIncome - ttlTax));
        }

    }
}
