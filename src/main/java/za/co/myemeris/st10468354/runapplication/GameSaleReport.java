package za.co.myemeris.st10468354.runapplication;

public abstract class GameSaleReport extends GameSales {
    public GameSaleReport(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
    
    // print report 
    public void printSalesReport() {
        System.out.println("COBSOLE SALES REPORT");
        System.out.println("***********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALE: " + getTotalSales());
        System.out.println("***********************");
    }
}
