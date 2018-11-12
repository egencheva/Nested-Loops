import java.util.Scanner;

public class PartyInvitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine().toLowerCase();
        double valid = 0.0;
        double invalid = 0.0;

        while (!name.equals("statistic")) {
            boolean isTrue = true;
            for (int i = 0; i < name.length(); i++) {
                if (!((int) name.charAt(i) >= 97 && (int) name.charAt(i) <= 122)) {
                    isTrue = false;
                }
            }
            if (isTrue) {

                int firstLetter = (char) name.charAt(0) - 32;
                String validName = (char) firstLetter + "";
                for (int i = 1; i < name.length(); i++) {
                    validName += name.charAt(i);
                                  }
                System.out.print(validName);
                valid++;
            } else {
                System.out.print("Invalid name!");
                invalid++;
            }
            System.out.println();
            name = scanner.nextLine().toLowerCase();
        }
        double validPerc = valid / (valid + invalid) * 100;
        double invalidPerc = invalid / (valid + invalid) * 100;
        System.out.printf("Valid names are %.2f%% from %.0f names.%n", validPerc, (valid + invalid));
        System.out.printf("Invalid names are %.2f%% from %.0f names.", invalidPerc, (valid + invalid));
    }
}
