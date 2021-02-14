// Adish Shah
// Computer Science 20
// Henry Wise Wood High School
// 2020-2021 Semester 1


import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeChange {

    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);

        try {
            System.out.print("Please Enter a Dollar Amount:");

            double dollarAmount = theScanner.nextDouble();

            double toonies = Math.round((dollarAmount / 2) * 100.0) / 100.0; //Calculates amount of toonies
            int tooniesDisplay = (int) toonies;
            double dollarAmountOne = Math.round((dollarAmount - tooniesDisplay * 2) * 100.0) / 100.0; //Calculates amount of money after toonies are deducted from total

            int loonies = (int) dollarAmountOne; //Shows amount of loonies
            double dollarAmountTwo = Math.round((dollarAmountOne - loonies) * 100.0) / 100.0; //Calculates amount of money after loonies are also deducted from total

            double quarters = Math.round((dollarAmountTwo / 0.25) * 100.0) / 100.0; //Calculates amount of quarters
            int quartersDisplay = (int) quarters;
            double dollarAmountThree = Math.round((dollarAmountTwo - quartersDisplay * 0.25) * 100.0) / 100.0; //Calculates amount of money after quarters are also deducted from total

            double dimes = Math.round((dollarAmountThree / 0.1) * 100.0) / 100.0; //Calculates amount of dimes
            int dimesDisplay = (int) dimes;
            double dollarAmountFour = Math.round((dollarAmountThree - dimesDisplay * 0.1) * 100.0) / 100.0; //Calculates amount of money after dimes are also deducted from total

            double nickels = Math.round((dollarAmountFour / 0.05) * 100.0) / 100.0; //Calculates amount of nickels
            int nickelsDisplay = (int) nickels;
            double dollarAmountFive = Math.round((dollarAmountFour - nickelsDisplay * 0.05) * 100.0) / 100.0; //Calculates amount of money after nickels are also deducted from total

            double pennies = Math.round((dollarAmountFive / 0.01) * 100.0) / 100.0; //Calculates amount of pennies
            int penniesDisplay = (int) pennies; //integer used to calculate rounding

            if (penniesDisplay >= 3) {
                nickelsDisplay = nickelsDisplay + 1;
            }

            if (nickelsDisplay == 2) {
                nickelsDisplay = 0;
                dimesDisplay = dimesDisplay + 1;
            }

            if (quartersDisplay == 3 && dimesDisplay == 2 && nickelsDisplay == 1) {
                loonies = loonies + 1;
                quartersDisplay = 0;
                dimesDisplay = 0;
                nickelsDisplay = 0;
            }

            if (loonies == 2) {
                loonies = 0;
                tooniesDisplay = tooniesDisplay + 1;
            }

            System.out.println("toonies:"+tooniesDisplay+";"+" loonies:"+loonies+";"+" quarters:"+quartersDisplay+";"+" dimes:"+dimesDisplay+";"+" nickels:"+nickelsDisplay);

        }
        catch (Exception e1) {
            System.out.println("INVALID");
        }
    }
}
