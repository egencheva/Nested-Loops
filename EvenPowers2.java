import java.util.Scanner;

public class EvenPowers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double num=1;

        for (int i = 0; i <=n; i+=2) {
            if (i%2==0)

            num= Math.pow(2,i);
            System.out.printf("%.0f%n",num);
        }
    }
}