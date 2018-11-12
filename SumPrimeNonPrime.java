import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNormal = 0;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            }else {
                int i = num;
                int counter = 0;


                for(;num >= 1; num--) {

                    if ( i % num == 0 )
                    {
                        counter++;
                    }
                }
                if (counter == 2)
                {
                    sumPrime += i;
                }
                else
                {
                    sumNormal += i;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNormal);
    }
}
