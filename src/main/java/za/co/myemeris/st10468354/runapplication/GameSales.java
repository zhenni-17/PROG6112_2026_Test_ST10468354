package za.co.myemeris.st10468354.runapplication;

public abstract class GameSales implements IConsoles {
    private String consoleType;
    private String store;
    private int totalSales;
    
    // to choose waht console type, store and total sales
    public GameSales(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

        public String getConsoleType() {
            return consoleType;
        }

    @Override
        public String getStore() {
            return store;
        }

    @Override
        public int getTotalSales() {
            return totalSales;
        }
}

