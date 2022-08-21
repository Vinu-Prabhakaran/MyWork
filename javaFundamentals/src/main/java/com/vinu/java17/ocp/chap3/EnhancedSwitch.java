package com.vinu.java17.ocp.chap3;
/**
 * @author Vinu Prabhakaran
 *         on Jun 22, 2022
 *
 */
public class EnhancedSwitch {

    public static void main(String[] args) {
        var input = "D";
        System.out.println(switchTest(input));
        System.out.println(getSeasonWithYield(5));
        System.out.println(getSeasonWithoutYield(2));
    }

    public static String switchTest(String input) {
        System.out.println("EnhancedSwitch.switchTest");
        switch (input) {
            case "A", "B" -> {
                return "Case1";
            }
            case "C" -> {
                return "Case2";
            }
            default -> {
                return "Default";
            }
        }
    }

    private static String getSeasonWithYield(int month) {
        System.out.println("EnhancedSwitch.getSeasonWithYield");
        String season = switch (month) {
            case 1, 2, 3 -> {
                yield "Winter";
            }
            case 4, 5, 6 -> {
                yield "Spring";
            }
            case 7, 8, 9 -> {
                yield "Summer";
            }
            case 10, 11, 12 -> {
                yield "Fall";
            }
            default -> {
                yield "Invalid Month";
            }
        };
        return season;
    }

    private static String getSeasonWithoutYield(int month) {
        System.out.println("EnhancedSwitch.getSeasonWithoutYield");
        switch (month) {
            case 1, 2, 3 -> {
                return "Winter";
            }
            case 4, 5, 6 -> {
                return "Spring";
            }
            case 7, 8, 9 -> {
                return "Summer";
            }
            case 10, 11, 12 -> {
                return "Fall";
            }
            default -> {
                return "Invalid Month";
            }
        }
    }

    public static void printDayOfWeek(int day) {
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(result);
    }
}
