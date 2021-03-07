# WaterlooPortfolio2021
## Introduction
### Hello, Welcome to Adish's Coding Portfolio! 
#### I greatly appreciate the time and effort you are putting in to see my work. It took me a long time in organzing this masterpiece and so, I really do hope you enjoy and get a feel of some of my talents and skills in programming. Without further ado, let's get started with going over what this portfolio looks like.:sunglasses:
 
## Overview
#### This portfolio will contain projects and assignments that are based on Java. I have built projects that are based on python and web-development programming languages like HTML, CSS, and JavaScript however, those are more complex and harder for me to showcase at the moment because they are still a work in progress. So for the sake of simplicity, I have kept this portfolio Java-based only. HEY BUT C'MON, EVERYONE LOVES JAVA!:smile::satisfied:      

#### Anyways, all the work I have uploaded onto this portfolio has been stuff I worked on during a computer science course I participated in at my high school. This is work from semester 1 though, I am still apart of the CS course in semester 2 as I chose to do this course for a full year because coding is my passion!!!:blue_heart::purple_heart::green_heart::heart: 

#### For the most part, I made all the materials within this portfolio easy to access but let's do a quick walkthrough on how you can access the files. If you are reading this text, then you should be on the repository's main page. Simply, click on the "Coding" folder under the "main" branch and then you will see two more folders that says "Assignments" and "Projects". Click on one of them and you will then be directed to the folder that contains each of the assignments or each of the projects depending on which folder you chose. There are 3 assignments and 3 projects to choose from which are the following: 

### Assignments &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Projects                   
#### 1. Combination Lock &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1. Bank Account Graphical User Interface           
#### 2. Game of Life &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   2. Connect 4 Game
#### 3. Make Change &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  3. Triangle Classifier Graphical User Interface

#### From here, if you are still reading this (sorry for making this long btw:sleeping::sleepy:, I will try to speed up I promise!!:sweat_smile:) and know how to run the program(s) on you IDE, then you can simply skip to the "Assignment Description" section that explains how each assignment works. If not, then I will explain to the best of my abilities on how you can run the program(s) on your computer in the next section which is right below this line. 

## How to Run the Program(s) on Your Computer
#### Alright so first, you need to download an IDE on your computer that supports Java Files. Some common IDE's for Java are IntelliJ IDEA, Visual Studio Code, and NetBeans. Once you have downloaded the appropriate IDE, you need to add the Java Extension so that your IDE can support Java formatted files (this is not required if you downloaded IntelliJ). You then need to create a "New Project" in your IDE first before copying the files from this portfolio onto your computer for the corresponding assignment or project. Make sure to name the project the same as what the assignment is called, otherwise, you may not be able to run the program. One of the assignments and projects has a number after its name for its folder within this portfolio, you can simply ignore that and just call your project by the name without having that number at the end. 

#### Once this step has been completed, you then need to copy all the files from the "src" folder of each assignment or project from this portfolio to the "src" folder for the new project that you created locally on your computer in your IDE. That "src" folder for the new project you created should be inside the directory you chose on your computer as you were making the project. ***Do not copy any other files from the assignment(s) or project(s) folder in this portfolio other than the files inside the "src" folder.*** The other files were created when building the project on its corresponding IDE. Therefore, you already have those files when you created the project and those files will be different based on which IDE you are using as a different working environment will be produced. 

#### Last but not least, after copying the files into your "src" folder for the new project you created on your computer within the IDE, you may get some errors saying you need to add certain libraries and directories for the src files to run depending on the assignment or project if you tried to run the program. If this is the case, the IDE will tell you what you need to add or what you need to import to actually run the code and you can simply add in the elements to your IDE based on what the IDE is telling you. 

#### And now my freinds, you are done! The code should successfully run on your computer without any errors after hitting that play button. HOORAY!!! YOU DID IT!!:astonished::satisfied::thumbsup::clap: 

#### BUT, don't get too excited yet as you may not know how to use the program because you may have no clue what the assignment(s) or the project(s) are about.:weary::cry::rage: 

#### Sorry for getting your hopes up but unfortunately, you are going to have to read the next section and the section after that which describes all the assignments and projects in this portfolio if you have no idea how to utilize the program. And yes, that means more reading!:disappointed_relieved::tired_face:

## Assignment Descriptions 
#### The moment you have been waiting for has finally arrived. In this section, a description for each of the assignments will be mentioned in regards to what the assignment is and how each of the program works. The assignments I will be going over are Combination Lock, Game of Life, and Make Change as those are the materials that are uploaded onto this portfolio. And so, let's get started! :) 

### Combination Lock
#### For this ComboLock assignment, I have created a digital combination lock that can be opened with the correct seqeunce of operations and numbers. Usually, the pattern to opening a lock would be right - left - right. Meaning, you first turn the lock clockwise to the first number, and then you turn the lock counter-clockwise to the second number, and finally, you turn the lock clockwise again to the third number as your password would be composed of a series of 3 numbers in order to open the lock. This is excatly how I programmed the digital lock in order to open it. It follows the same pattern as right - left - right.

#### To actually run the program, you need to run the file that says "ComboLockRun.java". The other files are for building this digital lock and are not neccessary to look at unless you want to obviously. Once you run the "ComboLockRun.java" file, the program should have a main function that will ask the user what they would like to do, giving them four options which are as follows: 
#### 1. Turn the lock to the left to a number
#### 2. Turn the lock to the right to a number
#### 3. Open the lock 
#### 4. Retrieve the combination

#### Now because this is a digital lock, the user needs to first retrieve the combination to know what their combo is. So, you can simply press "4" on your keyboard to recieve your combination. That Combo will remain the same until you have opened the lock. Now you need to follow the pattern I described above to actually open the lock. You need to click on numbers "1" and "2" to turn the lock left and right towards the appropriate number of your combo. Once you chose which way the lock has turned, the program will tell you to either "Enter what position to turn left to:" or "Enter what position to turn right to:" so that's when you enter the combo number you are turning towards in order to open the lock. Remember, the pattern is right - left - right and you only need to make 1 turn each. Once you think you have dialed in the numbers with the correct sequence, you can simply press the number "3" on your keyboard to open the lock. If your lock opens, the terminal will print out a message saying "The lock was opened" if not, the program will print out "The lock remains locked" and unfortunately you are going to have to try again. Sorry! :( 

#### Keep in mind, if you forget your combination while you are turning your lock, you can press "4" again to retrieve the combo and hopefully, work your way to successfully open the lock. Good Luck!

### Game of Life
#### This program implements a simple version of the Game of Life (not the board game, but John Conway's Game of Life). For this assignment, you don't really need to use the program itself. Simply go to the "GameOfLifeTest.java" and run the test. You can see that the code will implement the rules that make up John Conway's Game of Life project. The different generations will also be shown with the corresponding pieces in the terminal as the test successfully passes. The stars represent the cells that are alive while the dot means that the cells are dead and this will be different for each generation. That is pretty much it for this one. If you don't know how the Game of Life works, you can simply go to the "Images" folder in this repository and click on "Game of Life" to see some pictures that give an example and describe what the Game of Life program looks like. Hope you enjoy this assignment!

### Make Change 
#### Finally, the last assignment is based on recieveing change from the cashier when you want coins to buy food from the vending machine (not really but it uses similar concepts!). Anyways, all you have to do to successfully run this program is to run the "MakeChange.java" file and the program will ask you to "Please Enter a Dollar Amount:". So then, enter any amount in $0.00 format and the program will automatically convert your given amount to the appropriate number of toonies; loonies; quarters; dimes; and nickels which is basically your change. Wish you the best of luck in buying as many snacks as you can from the vending machine!  

#### Welp, that is it for describing all the assignments. I have added demonstration videos that shows what each of the programs should look like onto this portfolio. Although, you may not be able to watch these videos on GitHub itself, you need to download them on your computer and watch them as the file size is big. 

#### Please tune in below to read over the descriptions I have for each of my projects. Trust me, you are almost done reading!!

## Project Descriptions

#### This section will provide a description for each of the projects in regards to what the project is about and how each of the program works. The projects I will be going over is a Bank Account GUI program, a Connect 4 Game, and a Triangle Classifier GUI program as provided below. 

### BankAccount Graphical User Interface 
#### This application represents a functional GUI that models a bank machine. It allows the user to interact (i.e. make withdrawals or deposits) on multiple bank accounts including a chequing and savings account showing the balance on each of these accounts depending on what type of transaction the user makes. This online banking also shows a list of all the transactions with proper dates and descriptions that was made by the user and the transaction will be sorted from oldest to newest depending on what date range the user inputs. 

### Connect 4 Game 
#### This was a final project that me and my friend did for our computer science course in the first semester. What we implemented was our version of the Connect 4 game where I am the AI bot that the user gets to play against. The name "Adish" is  given as a reference to the bot in the game.

#### To play, add the Connect4.jar to your build path (this loads the JFrame and Graphics). How to do this will vary depending on the IDE. But for Eclipse, on your project folder, go to 'Properties' then 'Add JARs'. Select the "Connect4.jar" to add the file to your project. Afterwards, run the Connect 4 game via the "Connect4.java" file and finally, follow the instructions by the bot, Adish, to start the game.     

#### The user will input their name and will choose the difficulty of the AI bot depending on their skill level from 1 to 5. After the user enters their name and difficulty, the program will initiate by showing a picture of Adish saying “Bring it on bud”. Then the gameboard will pop up allowing the user to click on a series of buttons at the bottom of the screen to choose where they want to place their game pieces, allowing the game to initiate. After the user has chosen where they want to place their game piece, the AI bot will process a bunch of algorithms like “for loops” and “if-else statements” to make his turn as well based on the difficulty that the user has selected. Once the game is finished, when someone has connected 4 game pieces together either horizontally, vertically, or diagonally, the system will show a pop-up message stating that the winner has won the game. If the real player won the game, a picture of the AI bot (Adish) will pop up saying “Sorry I am bad at Connect4” otherwise if the AI bot won, then it will say “Get Rekt Loser”.

#### **Please note that the "Connect4.jar" file is given credit to Delos Chang for this project.**

### Triangle Classifier
#### And here we are, at the last description from the materials uploaded onto this portfolio!:relieved: This program is very simply and easy to use. All the user has to do is enter 3 angles for the program to classify what type of triangle is made from those angles. If the 3 angles sum up to a value that is not 180, the system will say "INVALID" because all the angles for a triangle must add up to 180. If the user enters 0 for one of the angles, then the program will also say "INVALID" because a triangle must have 3 angles as well. 

## Conclusion

#### Congratulations on making it this far! 

#### It is time to finally wrap up the reading and start exploring the portfolio! If you have any question(s) or concern(s), you can contact me using my email which is adish.shah2003@gmail.com. And once again, thank you very much for giving up some of your time to see my GitHub! It really means a lot to me. :) 

 




