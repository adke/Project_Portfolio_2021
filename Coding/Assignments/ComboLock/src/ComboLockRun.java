import java.util.Scanner;

public class ComboLockRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = "password123";
        boolean esc = false;

        ComboLock cl = new ComboLock(password);
        do{
            System.out.println("What would you like to do, here are the four options:");
            System.out.println("1. Turn to the left");
            System.out.println("2. Turn to the right");
            System.out.println("3. Open the Lock");
            System.out.println("4. Retrieve the combination");
            String choice = scanner.nextLine();

            switch(choice) {
                case "1":
                    System.out.println("Enter what position to turn left too:");
                    String guessL = scanner.nextLine();
                    System.out.println("Turning to the left to position "+ guessL +"...");
                    cl.turnLeft(Integer.parseInt(guessL));
                    break;

                case "2":
                    System.out.println("Enter what position to turn right to");
                    String guessR = scanner.nextLine();
                    System.out.println("Turning to the right to position" + guessR +"...");
                    cl.turnRight(Integer.parseInt(guessR));
                    break;

                case "3":
                    if(cl.isOpen()){
                        System.out.println("The Lock was opened");
                        esc = true;
                    }
                    else{
                        System.out.println("The Lock remains locked");
                    }


                    break;

                case "4":
                    int combo[] = cl.forgotNumbers(password);

                    if(combo != null){
                        System.out.println("The combination is [" + combo[0] + "] [" + combo[1] + "] [" + combo[2] + "]");
                    }
                    else{
                        System.out.println("Wrong password try again!");
                    }

                    break;

                default:
                    System.out.print("Not valid option, select again between 1-4");
            }
        }while(esc == false);
    }
}