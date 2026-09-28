package za.co.myemeris.st10468354.gamesalesapp;

import java.util.Scanner;

public class GameSalesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // using 2d array
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        System.out.println("-------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s %-15s%n", "", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-15d %-15d %-15d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("----------------------------------");
        System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
        System.out.println("----------------------------------");

        int[] cityTotals = new int[cities.length];
        int highest = 0;
        String cityWithMost = "";

        for (int i = 0; i < cities.length; i++) {
            cityTotals[i] = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.printf("%-20s %d%n", cities[i], cityTotals[i]);

            if (cityTotals[i] > highest) {
                highest = cityTotals[i];
                cityWithMost = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES " + cityWithMost);

        scanner.close();
        
    }
}
