import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        String ppt = "";
        int count = 0;
        int countAll = 0;
        double grade = 0.0;
        double gradePerPpt = 0.0;
        double ttlGrade = 0.0;
        double avgGrade = 0.0;

        while (!input.equals("Finish")) {
            ppt = (input);
            for (int i = 1; i <= n; i++) {
                grade = Double.parseDouble(scanner.nextLine());
                gradePerPpt +=grade;
                ttlGrade =ttlGrade+ grade;
                count++;
                countAll++;
            }

           double avgPerPpt =gradePerPpt / count;
            System.out.printf("%s - %.2f.%n", ppt, avgPerPpt);
            input = scanner.nextLine();
            gradePerPpt = 0;
            count = 0;
        }
      double  avgGrades = ttlGrade / countAll;
        System.out.printf("Student's final assessment is %.2f.", avgGrades);

    }
}