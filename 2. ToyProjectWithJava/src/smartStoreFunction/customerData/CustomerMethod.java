package smartStoreFunction.customerData;

import DB.CustomerDTO;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerMethod {

    CustomerDTO customerDTO = new CustomerDTO();

    public boolean showCustomerList(String purpose) {
        if (CustomerDTO.CustomerList.size() != 0) {
            System.out.println("========================================");
            System.out.printf(String.format("|%-38s|\n", String.format(" << Customer Info. %s>>", purpose)));
            System.out.println("----------------------------------------");
            for (String[] customers : CustomerDTO.CustomerList) {
                System.out.println(Arrays.toString(customers));
            }
            System.out.println("========================================");
            return true;
        } else {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Customer Info. >>");
            System.out.println("----------------------------------------");
            System.out.printf("|%-38s|\n", " No Customer ");
            System.out.println("========================================");
            return false;
        }
    } // showCustomerList

    public String checkUserId() {
        String userID;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("--> ID : ");
            String userID_ = sc.nextLine();
            if (userID_.equals("-1")) {
                userID = "-1";
                break;
            } else if (userID_.matches("^[a-zA-Z][a-zA-Z0-9]{4,16}$")){
                userID = userID_;
                break;
            } else {
                System.out.println(">> Invalid Input. Please try again << \n");
            }
        } // while문

        return userID;
    } // checkUserID()


    public String checkSpentTime() {
        String spentTime;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("--> Spent Time : ");
            String spentTime_;

            try {
                spentTime_ = sc.nextLine();
            } catch (InputMismatchException e) {
                spentTime_ = "-2";
            }

            if (spentTime_.equals("-1")) {
                spentTime = "-1";
                break;
            } else if (0 <= Integer.parseInt(spentTime_) && Integer.parseInt(spentTime_) < 1_000_000_000) {
                spentTime = spentTime_;
                break;
            } else if (0 > Integer.parseInt(spentTime_) || Integer.parseInt(spentTime_) > 1_000_000_000) {
                System.out.println(">> Invalid Input. Please try again <<");
                System.out.println(">> Please Input Num Under 1,000,000,000 <<");
            } else {
                System.out.println(">> Invalid Input. Please try again << \n");
            }
        } // while문

        return spentTime;
    } // checkSpentTime


    public String checkTotalPayment() {
        String totalPayment;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("--> Spent Time : ");
            String totalPayment_;

            try {
                totalPayment_ = sc.nextLine();
            } catch (InputMismatchException e) {
                totalPayment_ = "-2";
            }

            if (totalPayment_.equals("-1")) {
                totalPayment = "-1";
                break;
            } else if (0 <= Integer.parseInt(totalPayment_) && Integer.parseInt(totalPayment_) < 1_000_000_000) {
                totalPayment = totalPayment_;
                break;
            } else if (0 > Integer.parseInt(totalPayment_) || Integer.parseInt(totalPayment_) > 1_000_000_000) {
                System.out.println(">> Invalid Input. Please try again <<");
                System.out.println(">> Please Input Num Under 1,000,000,000 <<");
            } else {
                System.out.println(">> Invalid Input. Please try again << \n");
            }
        } // while문

        return totalPayment;
    } // checkTotalPayment()

    public boolean inputAreYouSure() {
        String areYouSure;
        while(true) {
            Scanner scbaby = new Scanner(System.in);

            System.out.print("--> Are You Sure To Input Info? (y/n) : ");

            areYouSure = scbaby.nextLine();

            if (areYouSure.equals("y") || areYouSure.equals("yes")) {
                return true;
            } else if (areYouSure.equals("n") || areYouSure.equals("no")) {
                return false;
            } else {
                System.out.println(">> Invalid Input. Please try again << \n");
            }
        }
    } // inputAreYouSure()


} // CustomerMethod