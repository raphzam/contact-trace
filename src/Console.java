import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static String readLine(String prompt) {
        printPrompt(prompt);
        return scanner.nextLine();
    }

    public static int readNumber() {
        return scanner.nextInt();
    }

    public static void printPrompt(String prompt) {
        System.out.println(prompt);
    }


}
