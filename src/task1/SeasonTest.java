package task1;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        String userCommand = userCommand();
        getInfo(spring, summer, autumn, winter, userCommand);

    }

    private static void getInfo(Season spring, Season summer, Season autumn, Season winter, String userCommand) {
        switch (userCommand) {
            case "Wiosna" :
                System.out.println(Arrays.toString(spring.getMonthTab()));
                break;
            case "Lato" :
                System.out.println(Arrays.toString(summer.getMonthTab()));
                break;
            case "Jesień" :
                System.out.println(Arrays.toString(autumn.getMonthTab()));
                break;
            case "Zima" :
                System.out.println(Arrays.toString(winter.getMonthTab()));
                break;
            default:
                System.out.println("Taka pora roku nie istnieje!");
        }
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
        return order;
    }
}
