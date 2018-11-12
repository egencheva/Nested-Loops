import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int n1 = a; n1 <= b; n1++) {
            for (int n2 = a; n2 <= b; n2++) {
                for (int n3 = c; n3 <= d; n3++) {
                    for (int n4 = c; n4 <= d; n4++) {
                        if (n1!=n2 && n3!=n4 && n1+n4==n3+n2){
                            System.out.println("" + n1 + n2 +"\n" +n3 +n4+"\n");
                        }
                    }

                }
            }
        }
    }
}
