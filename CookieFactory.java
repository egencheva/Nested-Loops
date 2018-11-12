import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String products = "";
        boolean flour = false;
        boolean sugar = false;
        boolean eggs = false;

        for (int i = 1; i <= n; i++) {

            while (!flour || !sugar || eggs || !products.equals("Bake!")) {
                products = scanner.nextLine();
                if (products.equals("flour")) {
                    flour = true;
                } else if (products.equals("sugar")) {
                    sugar = true;
                } else if (products.equals("eggs")) {
                    eggs = true;
                }
                if (products.equals("Bake!")) {
                    if (flour && sugar && eggs){
                        System.out.printf("Baking batch number %d...%n",i);
                        flour=false;
                        sugar=false;
                        eggs=false;
                        break;
                    }else{
                        System.out.printf("The batter should contain flour, eggs and sugar!%n");
                    }
                }
            }
        }
    }
}
