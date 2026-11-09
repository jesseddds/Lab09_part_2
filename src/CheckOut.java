import java.util.Scanner;
public class CheckOut {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double total = 0;
        boolean more = true;

        while (more)
        {
            price = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);
            total = total + price;

            more = SafeInput.getYNConfirm(in, "Do you have more items");



        }
        System.out.printf("\nThe total cost is: $%.2f\n", total);

    }
}
