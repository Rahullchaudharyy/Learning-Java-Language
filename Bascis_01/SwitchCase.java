public class SwitchCase {

    public static void main(String as[]) {

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sarturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Unknown Day");
                break;
        }

        // New Switch In the Java

        String Day = "Monday";

        switch (Day) {
            case "Monday" -> System.out.println("Start of a productive week!");
            case "Tuesday" -> System.out.println("Keep going, you're doing great!");
            case "Wednesday" -> System.out.println("Midweek motivation, stay strong!");

            case "Thursday" -> System.out.println("Almost there, keep pushing!");
            case "Friday" -> System.out.println("Weekend is near, finish strong!");
            case "Saturday" -> System.out.println("Enjoy your weekend!");
            case "Sunday" -> System.out.println("Relax and recharge for the new week!");
            default -> System.out.println("Invalid day");
        }

    }
}
