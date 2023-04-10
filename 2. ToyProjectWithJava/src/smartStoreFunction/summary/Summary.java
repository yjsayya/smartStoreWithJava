package smartStoreFunction.summary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Summary {

    SummaryMethod summaryMethod = new SummaryMethod();
    public void summaryAll() {
        printSummaryMenu("UID");
    }

    public void summaryById() {
        printSummaryMenu("userID");
    }

    public void summaryBySpentTime() {
        printSummaryMenu("spentTime");
    }

    public void summaryByTotalPayment() {
        printSummaryMenu("totalPayment");
    }


    public void printSummaryMenu(String sortingBy) {
        Scanner sc = new Scanner(System.in);

        boolean power = true;
        while (power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Summary >>");
            System.out.println("----------------------------------------");
            System.out.printf("|%-38s|\n", " 1. Ascending");
            System.out.printf("|%-38s|\n", " 2. Descending");
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

            switch (index) {
                case 1:
                    summaryMethod.arrangeCustomerList();
                    summaryMethod.sortList(sortingBy, "asc");
                    summaryMethod.resetAllList();
                    continue;
                case 2:
                    summaryMethod.arrangeCustomerList();
                    summaryMethod.sortList(sortingBy, "desc");
                    summaryMethod.resetAllList();
                    continue;
                case 3:
                    power = false;
                    break;
                case 4:
                    System.out.println("\n>> Invalid Input. Please try again <<\n");
                    System.out.println(" ");
                    break;
            }

        } // while문
    } // printSummaryMenu

} // Summary