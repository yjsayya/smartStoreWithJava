package smartStoreFunction;

import smartStoreFunction.customerData.*;
import smartStoreFunction.summary.Summary;
import smartStoreFunction.tierSetting.TierSetting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);
    TierSetting tierSetting = new TierSetting();
    CustomerData customerData = new CustomerData();
    Summary summary = new Summary();

    public void printMainMenu() {
        boolean power = true;
        while(power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Main Menu >>");
            System.out.println("----------------------------------------");
            System.out.printf("|%-38s|\n", " 1. Tier Setting");
            System.out.printf("|%-38s|\n", " 2. Customer Data");
            System.out.printf("|%-38s|\n", " 3. Summary");
            System.out.printf("|%-38s|\n", " 4. Log Out");
            System.out.println("========================================");
            System.out.print("--> Choose One: ");
            int index;
            try {
                index = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                index = 6;
            }
            System.out.println(" ");
            System.out.println(" ");

            switch (index) {
                case 1:
                    printTierSettingMainMenu();
                    continue;
                case 2:
                    printCustomerDataMainMenu();
                    continue;
                case 3:
                    printSummaryMainMenu();
                    continue;
                case 4:
                    power = false;
                    break;
                default:
                    System.out.println(">> Invalid Input. Please try again <<");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            }

        } // while문
    } // printMainMenu()


    public void printTierSettingMainMenu() {
        boolean power = true;
        while (power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Tier Setting >>");
            System.out.println("----------------------------------------");
            System.out.printf("|%-38s|\n", " 1. view Tier");
            System.out.printf("|%-38s|\n", " 2. Change Tier");
            System.out.printf("|%-38s|\n", " 3. Back");
            System.out.println("========================================");
            System.out.print("--> Choose One: ");
            int index;
            try {
                index = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                index = 4;
            }
            System.out.println(" ");
            System.out.println(" ");

            switch (index) {
                case 1:
                    tierSetting.viewTier();
                    continue;
                case 2:
                    tierSetting.changeTier();
                    continue;
                case 3:
                    power = false;
                    break;
                default:
                    System.out.println(">> Invalid Input. Please try again <<");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            }

        } // while문
    } // printTierSettingMainMenu()

    public void printCustomerDataMainMenu() {
            boolean power = true;
            while (power) {
                System.out.println("========================================");
                System.out.printf("|%-38s|\n", " << Customer Data >>");
                System.out.println("----------------------------------------");
                System.out.printf("|%-38s|\n", " 1. Add Customer Data");
                System.out.printf("|%-38s|\n", " 2. View Customer Data");
                System.out.printf("|%-38s|\n", " 3. Update Customer Data");
                System.out.printf("|%-38s|\n", " 4. Delete Customer Data");
                System.out.printf("|%-38s|\n", " 5. Back");
                System.out.println("========================================");
                System.out.print("--> Choose One: ");
                int index;
                try {
                    index = sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    index = 6;
                }
                System.out.println(" ");
                System.out.println(" ");

                switch (index) {
                    case 1:
                        customerData.addCustomerData();
                        continue;
                    case 2:
                        customerData.viewCustomerData();
                        continue;
                    case 3:
                        customerData.updateCustomerData1();
                        continue;
                    case 4:
                        customerData.deleteCustomerData();
                        continue;
                    case 5:
                        power = false;
                        break;
                    default:
                        System.out.println(">> Invalid Input. Please try again <<");
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
                }

            } // while문
    }   // printCustomerDataMainMenu()

    public void printSummaryMainMenu() {
        boolean power = true;
        while (power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Summary >>");
            System.out.println("----------------------------------------");
            System.out.printf("|%-38s|\n", " 1. Summary");
            System.out.printf("|%-38s|\n", " 2. Summary (Sorted By Name)");
            System.out.printf("|%-38s|\n", " 3. Summary (Sorted By Spent Time)");
            System.out.printf("|%-38s|\n", " 4. Summary (Sorted By Total Payment)");
            System.out.printf("|%-38s|\n", " 5. Back");
            System.out.println("========================================");
            System.out.print("--> Choose One: ");
            int index = 0;
            try {
                index = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                index = 6;
            }
            System.out.println(" ");
            System.out.println(" ");

            switch (index) {
                case 1:
                    summary.summaryAll();
                    continue;
                case 2:
                    summary.summaryById();
                    continue;
                case 3:
                    summary.summaryBySpentTime();
                    continue;
                case 4:
                    summary.summaryByTotalPayment();
                    continue;
                case 5:
                    power = false;
                    break;
                default:
                    System.out.println(">> Invalid Input. Please try again <<");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            }

        } // while문
    }   // printCustomerDataMainMenu()


} // MainMenu class