import java.util.Scanner;
import java.util.Random;

public class RangedIntDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];
        int count = 0;


        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        int userValue = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100", 1, 100);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue)
            {
                count++;
            }
        }
        if (count == 0)
        {
            System.out.println("The value " + userValue + " was not found in the array.");
        }
        else
        {
            System.out.println("The value " + userValue + " was found " + count + " times in the array.");
        }
        int userValue2 = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100", 1, 100);
        boolean found = false;
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue2)
            {
                found = true;
                position = i;
                break;
            }
        }
        if (found)
        {
            System.out.println("The value " + userValue2 + " was found at array index " + position);
        }
        else
        {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is " + min);
        System.out.println("The maximum value in the array is " + max);

        int total = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            total = total + dataPoints[i];
        }
        System.out.println("Test: sum is " + total + ", sum / 100 is " + (total / 100.0));

    }
    public static double getAverage(double values[])
    {
        double sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum = sum + values[i];
        }

        return sum / values.length;
    }

    public static double getAverage(int values[])
    {
        double sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum = sum + values[i];
        }

        return sum / values.length;
    }
}


