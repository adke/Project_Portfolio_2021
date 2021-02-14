//Adish Shah
//Computer Science 20
//Henry Wise Wood High School
//2020-2021 Semester 1

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ComboLock {
    private int[] guessArray = new int[3];
    private int[] comboArray = new int[3];
    private int secretOne = 0;
    private int secretTwo = 0;
    private int secretThree = 0;
    private String password = "";
    private boolean pos1 = false;
    private boolean pos2 = false;
    private boolean pos3 = false;

    public ComboLock(String pass) {

        // set all three numbers to random num between 1-60
        Random ran = new Random();
        int low = 1;
        int high = 61;
        //Choose random number for 1
        secretOne = ran.nextInt(high - low) + low;
        //Choose random number for 2
        secretTwo = ran.nextInt(high - low) + low;
        //Choose random number for 3
        secretThree = ran.nextInt(high - low) + low;
        //Check number if they aren't the same, else choose another number until they don't match
        while(secretOne == secretTwo){
            secretTwo = ran.nextInt(high - low) + low;
        }
        //Check 3 doesn't match with 1 or 2. If they are the same, choose another number until they don't match
        while(secretOne == secretThree || secretTwo == secretThree) {
            secretThree = ran.nextInt(high - low) + low;
        }
        //Set three numbers to combo array
        comboArray[0] = secretOne;
        comboArray[1] = secretTwo;
        comboArray[2] = secretThree;

        this.password = pass;
    }


    public ComboLock(int secretOne, int secretTwo, int secretThree) {
        // Set the password to null (they cannot use a password to retrieve the numbers)
        this.secretOne = secretOne;
        this.secretTwo = secretTwo;
        this.secretThree = secretThree;


        comboArray[0] = secretOne;
        comboArray[1] = secretTwo;
        comboArray[2] = secretThree;

        this.password = null;
    }

    public ComboLock(int secretOne, int secretTwo, int secretThree, String pass) {
        this.secretOne = secretOne;
        this.secretTwo = secretTwo;
        this.secretThree = secretThree;

        comboArray[0] = secretOne;
        comboArray[1] = secretTwo;
        comboArray[2] = secretThree;

        this.password = pass;
    }

    public void turnLeft(int position) {
        //turns the combination lock to the left and sets it to the number passed.
        //Resets if already done three times
        if (guessArray[0] != 0 && guessArray[1] != 0 && guessArray[2] != 0) {
            guessArray[0] = 0;
            guessArray[1] = 0;
            guessArray[2] = 0;
        }


        //Logic to test if it is the first, second or third pass.
        if(guessArray[0] == 0){
            guessArray[0] = position;
            pos1 = false;
        }
        else if(guessArray[1] == 0){
            guessArray[1] = position;
            pos2 = true;

        }
        else if(guessArray[2] == 0){
            guessArray[2] = position;
            pos3 = false;
        }
    }

    public void turnRight(int position) {
        // turns the combination lock to the right and sets it to the number passed.

        //Reset if already attempted combination
        if (guessArray[0] != 0 && guessArray[1] != 0 && guessArray[2] != 0) {
            guessArray[0] = 0;
            guessArray[1] = 0;
            guessArray[2] = 0;
        }


        //Logic to test if it is the first, second or third pass.
        if(guessArray[0] == 0){
            guessArray[0] = position;
            pos1 = true;
        }
        else if(guessArray[1] == 0){
            guessArray[1] = position;
            pos2 = false;

        }
        else if(guessArray[2] == 0){
            guessArray[2] = position;
            pos3 = true;
        }
    }

    public boolean isOpen() {
        //return True if the user turned the lock to the right to secretOne,
        //then to the left to secretTwo then finally right to secretThree.
        //If they do not do those three in order to the proper numbers, it should return false.
        if (Arrays.equals(guessArray, comboArray)) {
            if (pos1 == true && pos2 == true && pos3 == true) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }



    public int[] forgotNumbers(String passwordGuess) {
        //If the password is equal to the passwordGuess then return an integer array containing the combo, otherwise return null.
        //If the password is null this will always return null.
        if(password.equals(passwordGuess)){
            return comboArray;
        }

        else{
            return null;
        }
        }
    }


