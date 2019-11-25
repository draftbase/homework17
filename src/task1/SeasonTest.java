package task1;

import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        String userCommand = userCommand();
        Season.getInfo(userCommand);
    }

    private static String userCommand() {
        Season[] season = Season.values();
        System.out.println("Podaj porę roku. Możliwe wartości to:");
        for (Season s : season) {
            System.out.print(s.getName() + " ");
        }
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        scanner.close();
        return order;
    }
}
