import java.util.Scanner;

public class ConsoleUI {
    public static final Scanner scanner = new Scanner(System.in);

    public static void displayLoginPage() {
        System.out.println("========== UBank ==========");
    }

    public static void displayMainMenu() {
        System.out.println("\nMain Menu");
        System.out.println("R$ "); //Mostra o saldo do cliente atualizado
        System.out.println("1 - Create account");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - See balance");
        System.out.println("5 - Exit");
        System.out.print("Chose an option: ");
    }

    public static int readOption() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

}
