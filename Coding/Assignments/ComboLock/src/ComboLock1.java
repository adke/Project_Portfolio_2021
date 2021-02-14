import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ComboLock1 {

    private int secretOne = 0;
    private int secretTwo = 0;
    private int secretThree = 0;
    private int[] comboArray = new int[3];
    private int[] guessArray = new int[3];
    private String password = "";
    private boolean pos1 = false;
    private boolean pos2 = false;
    private boolean pos3 = false;

    public ComboLock1(String password) {

        // set all three numbers to random num bw 1-60
        Random random = new Random();
        int lowerbound = 1;
        int upperbound = 61;
        //Choose random number for 1
        secretOne = random.nextInt(upperbound - lowerbound) + lowerbound;
        //Choose random number for 2
        secretTwo = random.nextInt(upperbound - lowerbound) + lowerbound;
        //Check they arent the same, else choose another number until they dont match
        while (secretOne == secretTwo) {
            secretTwo = random.nextInt(upperbound - lowerbound) + lowerbound;
        }
        secretThree = random.nextInt(upperbound - lowerbound) + lowerbound;
        //Check 3 doesnt match with 1 or 2. If they arent the same, else choose another number until they dont match
        while (secretThree == secretOne || secretThree == secretTwo) {
            secretThree = random.nextInt(upperbound - lowerbound) + lowerbound;
        }
        //Set three numbers to combo array
        comboArray[0] = secretOne;
        comboArray[1] = secretTwo;
        comboArray[2] = secretThree;

        this.password = password;
    }

    public ComboLock1(int secretOne1, int secretTwo2, int secretThree3) {
        // Set the password to null (they cannot use a password to retrieve the numbers)
        secretOne = secretOne1;
        secretTwo = secretTwo2;
        secretThree = secretThree3;

        comboArray[0] = secretOne;
        comboArray[1] = secretTwo;
        comboArray[2] = secretThree;

        this.password = null;
    }

    public ComboLock1(int secretOne, int secretTwo, int secretThree, String password) {

        this.secretOne = secretOne;
        this.secretTwo = secretTwo;
        this.secretThree = secretThree;

        comboArray[0] = secretOne;
        comboArray[1] = secretTwo;
        comboArray[2] = secretThree;

        this.password = password;
    }

    public void turnRight(int number) {
        // turns the combination lock to the right and sets it to the number passed.

        //Reset if already attempted combination
        if (guessArray[0] != 0 && guessArray[1] != 0 && guessArray[2] != 0) {
            guessArray[0] = 0;
            guessArray[1] = 0;
            guessArray[2] = 0;
        }
        //Logic to test if it is the first, second or third pass.
        if (guessArray[0] == 0) {
            guessArray[0] = number;
            pos1 = true;
        } else if (guessArray[1] == 0) {
            guessArray[1] = number;
            pos2 = false;
        } else if (guessArray[2] == 0) {
            guessArray[2] = number;
            pos3 = true;
        }

    }

    public void turnLeft(int number) {
        // turns the combination lock to the left and sets it to the number passed.
        //Resets if already done three times
        if (guessArray[0] != 0 && guessArray[1] != 0 && guessArray[2] != 0) {
            guessArray[0] = 0;
            guessArray[1] = 0;
            guessArray[2] = 0;
        }

        //Logic to test if it is the first, second or third pass.
        if (guessArray[0] == 0) {
            guessArray[0] = number;
            pos1 = false;
        } else if (guessArray[1] == 0) {
            guessArray[1] = number;
            pos2 = true;
        } else if (guessArray[2] == 0) {
            guessArray[2] = number;
            pos3 = false;
        }

    }

    public boolean isOpen() {
        //return True if the user turned the lock to the right to secretOne,
        //then to the left to secretTwo then finally right to secretThree.
        //If they do not do those three in order to the proper numbers, it should return false.
        if (Arrays.equals(guessArray, comboArray)) {
            if (pos1 && pos2 && pos3) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public int[] forgotNumbers(String passwordGuess) {
        //If the password is equal to the passwordGuess then return an integer array containing the combo, otherwise return null.
        //If the password is null this will always return null.
        if (password.equals(passwordGuess)) {
            return comboArray;
        } else {
            return null;
        }

    }
}