import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl: ");
        int num1 = scanner.nextInt();
        System.out.println("Geben Sie die zweite Zahl: ");
        int num2 = scanner.nextInt();
        int res;
        System.out.println(" Geben Sie Aktion: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Resultat: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Resultat: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Resultat: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Resultat: " + res);
                }
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}
