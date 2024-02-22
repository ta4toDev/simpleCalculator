import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
                if (num2.compareTo(BigDecimal.ZERO) == 0) {
                    System.out.println("Error: Division durch Null ist nicht erlaubt.");
                    return;
                } else {
                    res = num1.divide(num2, 2, RoundingMode.HALF_UP); // Skala auf 2 Dezimalstellen, Rundungsmodus HALF_UP
                }
                break;
            default:
                System.out.println("Falsche Eingabe");
                return;
        }

        System.out.println("Ergebnis: " + res);
    }
}
