package tyreso.gymnasium.RegisCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    //main method

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        visaMeny();
    }

    /**
     * Visa meny.
     */
    private static void visaMeny(){

        Calculator calculator = new Calculator();

        while (true) {
            Scanner sc = new Scanner(System.in);
            boolean continueLoop = true;
            System.out.println("\n1.Plus\n2.Minus\n3.Multiplikation\n4.Division\n5.Avsluta");
            //ta input till menyval TODO Error handling på inkorrekt input
            byte menyVal = sc.nextByte();
            switch (menyVal) {

                case 1:
                    do {
                        try {
                            System.out.println("1");
                            int num1 = askForUserNumber();
                            System.out.println("You have entered: " + num1);
                            System.out.println();

                            System.out.println("Please write the second number");
                            int num2 = askForUserNumber();
                            System.out.println("You have entered: " + num2);

                            int answer = calculator.plus(num1, num2); //TODO PLACEHOLDER
                            System.out.println(num1 + " + " + num2 + " = " + answer);
                            continueLoop = false;}
                        catch (InputMismatchException e) { System.out.println(e);}
                        catch (IllegalStateException e) { System.out.println(e);}
                        catch (Exception e) {
                            System.out.println("Unexpected error type! Please submit bug report!");
                            System.out.println(e);
                        }
                    } while (continueLoop);
                    break;

                case 2:
                    do {
                        try {
                            //minusmethod
                            continueLoop = false;}
                        catch (InputMismatchException e) { System.out.println(e);}
                        catch (Exception e) {
                            System.out.println(e);
                            System.out.println("Unexpected error type! Please submit bug report!");
                            e.printStackTrace();
                        }
                    } while (continueLoop);
                    break;

                case 3:
                    do {
                        try {
                            //Multiplicationmethod
                            continueLoop = false;
                        } catch (Exception e) { System.out.println(e);}
                    } while (continueLoop);
                    break;

                case 4:
                    try {
                        //Divisionmethod }
                    }
                    catch (IllegalStateException e) { System.out.println(e); }
                    catch (IllegalCallerException e) { System.out.println(e); }
                    catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Unexpected error type, please submit bug report");
                        e.printStackTrace();}
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Vänligen välj genom att skriva in rätt siffra och bekräfta genom att trycka Enter");
            }
        }

    }

    public static int askForUserNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
