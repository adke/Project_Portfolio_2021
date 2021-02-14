package com.company;
//Adish Shah
//Computer Science 20
//Henry Wise Wood High School
//2020-2021 Semester 1


public class GameOfLife {

    //Assigning Variables for the game board
    private boolean[][] board;
    private int width = 0;
    private int height = 0;


    //Making the game board with a corresponding width and height
    public GameOfLife( boolean[][] board) {
        if (board != null) {  //board can not be equal to null
            this.board = board;
            width = board[0].length; //producing a certain width for the board (max width)
            height = board[1].length; //producing a certain height for the board (max height)
        }
    }
        //Calculating next generation game board using nested for loops and if statements
        public void calculateNextGeneration () {
            boolean[][] nextGenerationBoard = new boolean[width][height];  //creating new object for next generation game board with corresponding width and height
            for(int w = 0; w < width; w++) {   //assigning the width or x-value for each cell (alive or dead)
                for (int h = 0; h < height; h++) {  //assigning the height or y-value for each cell (alive or dead)
                    int neighbours = countNeighbours(w, h);

                    //if current cell is alive, then it is going to check for the neighbours surrounding that cell
                    if (board[w][h] == true) {
                        if(neighbours < 2){
                            nextGenerationBoard[w][h] = false;   //if the current alive cell has less than 2 neighbours, then that cell is going to die due to isolation in the next generation

                        }
                        else if(neighbours == 2 || neighbours == 3){
                            nextGenerationBoard[w][h] = true;    //if the current alive cell has 2 or 3 neighbours, then that cell will continue to live in the next generation

                        }
                        else if(neighbours > 3){
                            nextGenerationBoard[w][h] = false;  //if the current alive cell has more than 3 neighbours, then that cell is going to die due to overpopulation in the next generation
                        }

                    }
                    /*if the current cell is already dead, then it will check for the neighbours surrounding that cell
                    * and if the dead cell has 3 surrounding neighbours, then it will reproduce and become alive
                    * in the next generation*/
                    else {
                        if (board[w][h] == false){
                            if( neighbours == 3){
                                nextGenerationBoard[w][h] = true;
                            }
                        }

                    }
                }

            }

        this.board = nextGenerationBoard; //after calculating the next generation cells, the current generation game board will become the next generation game board

        }
        /*this method is checking how many of the 8 surrounding neighbours for each cell is/are alive
        * x and y are the coordinates for the neighbouring cells around the current cell */
        private int countNeighbours(int x, int y) {
            int count = 0;
            if (isAlive(x - 1, y - 1)) {
                count += 1;
            }
            if (isAlive(x, y - 1)) {
                count += 1;
            }
            if (isAlive(x + 1, y - 1)) {
                count += 1;
            }
            if (isAlive(x + 1, y)) {
                count += 1;
            }
            if (isAlive(x + 1, y + 1)) {
                count += 1;
            }
            if (isAlive(x, y + 1)) {
                count += 1;
            }
            if (isAlive(x - 1, y + 1)) {
                count += 1;
            }
            if (isAlive(x - 1, y)) {
                count += 1;
            }
            return count; //returns the total number of surrounding neighbours that are alive for each cell
        }

        //this method is printing out the actual game board for the current generation using nested for loops
        public void print(){
        String boardString = "";
        for(int w = 0; w < width; w++){  //assigning the width or x-value for each cell (alive or dead)
            for(int h = 0; h < height; h++){  //assigning the height or y-value for each cell (alive or dead)
                boardString +="[";        //creating opening square bracket for each cell

                if(board[w][h] == true){  //if current cell is alive, then the game board will print "*"
                   boardString +="*";

                }
                else if(board[w][h] == false){ //if current cell is dead, then the game board will print "."
                    boardString +=".";
                }
                boardString +="]";  //creating the closing square bracket for each cell

            }
            boardString += "\n";  //will print the elements of the game board on a new line
        }
            System.out.println(boardString); //will print out the current generation game board
        }

    /*this method is going to set whether the current cell at (x,y) is alive
    * as long as the cell(s) are within the boundary and if the game board is present*/
    public void setAlive(int x, int y, boolean isAlive) {
        if(board==null || x < 0 || x > width -1 || y < 0 || y > height -1){
            return;   //if the cell(s) are going out of bounds from the array or if there is no game board, then no value will be returned
        }
        else{
            board[x][y] = isAlive;  /*if the cell(s) are within the bounds of the array and if the game board is present,
                                    then the cell would be present */
        }

    }
    //this method is checking whether the current cell at (x,y) is alive
    public boolean isAlive(int x, int y) {
        /*if the cell(s) are out of bounds from the array,
        * then those cell(s) will not exist (will be dead)*/
        if(x < 0 || x > width - 1){
            return false;
        }
        if(y < 0 || y > height -1){
            return false;
        }
        return board[x][y]; //this is going to return the cell that is within the boundary of the game board

    }



}
