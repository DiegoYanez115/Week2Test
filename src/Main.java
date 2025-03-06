import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static IAuthenticationService authService = new AuthenticationService();
    private static boolean isRunning = true;

    public static void main(String[] args) {
        while (isRunning) {
            showMenu();
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to the To-Do List Application!");
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        handleMenu(choice);
    }

    public static void handleMenu(int choice) {
        switch (choice) {
            case 1:
                onLogIn();
                break;
            case 2:
                onSignUp();
                break;
            case 3:
                onExit();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void onLogIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = authService.logIn(username, password);
        if (user != null) {
            System.out.println("Welcome, " + user.getUsername() + "!");
            // TODO Later: Add the to-do list operations
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    public static void onSignUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = authService.signUp(username, password);
        if (user != null) {
            System.out.println("User " + username + " has been created successfully!");
        } else {
            System.out.println("The username is already taken!");
        }
    }

    public static void onExit() {
        isRunning = false;
        System.out.println("Goodbye!");
    }
}
