import java.util.InputMismatchException;
import java.util.Scanner;
import member.*;
public class StartPage {

    Login login = new Login();
    SignUp signUp = new SignUp();
    Scanner sc = new Scanner(System.in);

    public void printStartMenu() {
        boolean power = true;
        while(power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Start Page >>");
            System.out.println("----------------------------------------");
            System.out.printf("|%-38s|\n", " 1. Login");
            System.out.printf("|%-38s|\n", " 2. Sign Up");
            System.out.printf("|%-38s|\n", " 3. Quit");
            System.out.println("========================================");
            System.out.print("--> Choose One: ");
            int index = 0;
            try {
                index = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                index = 5;
            }
            System.out.println(" ");
            System.out.println(" ");

            switch(index)  {
                case 1:
                    login.inputLoginInfo();
                    break;
                case 2:
                    signUp.inputSignUpInfo();
                    break;
                case 3:
                    power = false;
                    break;
                default:
                    System.out.println(">> Invalid Input. Please try again <<");
                    System.out.println(" ");
                    System.out.println(" ");
            }

        } // while문


    } // printStartMenu()

} // Start Page