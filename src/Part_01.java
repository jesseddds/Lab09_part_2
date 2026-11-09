public class Part_01 {
    public static void main(String[] args) {


        int[] dataPoints = new int[100];


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)(Math.random() * 100) + 1;
        }


        System.out.println("The 100 random numbers are:");

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }


        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println();
        System.out.println("The sum of all the numbers is: " + sum);
        System.out.println("The average of all the numbers is: " + average);
    }
}