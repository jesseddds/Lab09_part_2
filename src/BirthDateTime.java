import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int maxDay = 0;

        year = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);
        switch (month)
        {
            case 2:
                maxDay = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            default:
                maxDay = 31;
                break;
        }

        day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, maxDay);
        hour = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);

        System.out.println("\nYou were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);
    }
}
