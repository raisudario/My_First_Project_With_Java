import java.util.Scanner;

/**
 * This program calculates the net income for a business,
 * considering earned income, staff expenses, and other expenses.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define product prices as a dictionary for easier access and modification
        String[] productsAndPrices = {
                "Bubblegum: $202",
                "Toffee: $118",
                "Ice cream: $2250",
                "Milk chocolate: $1680",
                "Doughnut: $1075",
                "Pancake: $80",
        };

        // Print earned amount with a header
        System.out.println("**Earned amount:**");
        for (String productPrice : productsAndPrices) {
            System.out.println(productPrice);
        }

        // Print income with a dollar sign
        System.out.println("\n**Income:** $" + 5405.0);

        // Get staff expense from user
        System.out.println("**Staff expenses:");
        int staffExpense = scanner.nextInt();

        // Get other expense from user
        System.out.println("**Other expenses:");
        int otherExpense = scanner.nextInt();

        // Calculate total expense
        int totalExpense = staffExpense + otherExpense - 5405;

        // Print net income with a dollar sign and formatting
        System.out.printf("**Net income:** $%,d\n", totalExpense);
    }
}