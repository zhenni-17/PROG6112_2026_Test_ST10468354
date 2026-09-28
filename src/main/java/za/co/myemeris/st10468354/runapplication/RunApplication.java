package za.co.myemeris.st10468354.runapplication;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the console type: ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter the store: ");
        String store = scanner.nextLine();

        System.out.print("Enter the total " + consoleType + " sales for " + store + ": ");
        int totalSales = scanner.nextInt();

        GameSaleReport report = new GameSaleReport(consoleType, store, totalSales);

        System.out.println();
        report.printSalesReport();

        scanner.close();
    }
}
