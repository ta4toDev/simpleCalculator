import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein: ");
        BigDecimal num1 = new BigDecimal(scanner.nextLine());

        System.out.println("Geben Sie die zweite Zahl ein: ");
        BigDecimal num2 = new BigDecimal(scanner.nextLine());

        System.out.println("Geben Sie die Aktion ein: ");
        String action = scanner.nextLine();

        BigDecimal res;
        switch (action) {
            case "+":
                res = num1.add(num2);
                break;
            case "-":
                res = num1.subtract(num2);
                break;
            case "*":
                res = num1.multiply(num2);
                break;
            case "/":
                try {
                    res = num1.divide(num2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division durch Null oder das Ergebbnis ist eine unendliche Dezimalzahl.");
                    return;
                }
                break;
            default:
                System.out.println("Falsche Eingabe");
                return;
        }

        System.out.println("Resultat: " + res);
    }
}
