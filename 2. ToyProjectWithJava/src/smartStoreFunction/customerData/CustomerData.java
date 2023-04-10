package smartStoreFunction.customerData;

import DB.CustomerDTO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerData {

    CustomerDTO customerDTO = new CustomerDTO();
    CustomerMethod customerMethod = new CustomerMethod();

    Scanner sc = new Scanner(System.in);


    public void addCustomerData() {
        String userID;
        String spentTime;
        String totalPayment;

        boolean power = true;
        while (power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Add Customer Data >>");
            System.out.printf("|%-38s|\n", " (Press '-1' To Exit)");
            System.out.println("----------------------------------------");
            // Customer ID 입력
            userID = customerMethod.checkUserId();
            if(userID.equals("-1")) {
                System.out.println("========================================");
                System.out.println(">> Add Customer Info Has Been Canceled << \n");
                System.out.println(" ");
                break;
            }
            // Spent time 입력
            spentTime = customerMethod.checkSpentTime();
            if (spentTime.equals("-1")) {
                System.out.println("========================================");
                System.out.println(">> Add Customer Info Has Been Canceled << \n");
                System.out.println(" ");
                break;
            }
            // Total Payment 입력
            totalPayment = customerMethod.checkTotalPayment();
            if (totalPayment.equals("-1")) {
                System.out.println("========================================");
                System.out.println(">> Add Customer Info Has Been Canceled << \n");
                System.out.println(" ");
                break;
            }

            // 마지막 check
            boolean check = customerMethod.inputAreYouSure();
            if (check) {
                String[] newCustomerInfo = new String[]{String.format("UID-%d", CustomerDTO.num), userID, String.valueOf(spentTime), String.valueOf(totalPayment)};
                CustomerDTO.num++;
                CustomerDTO.CustomerList.add(newCustomerInfo);
                System.out.println("========================================");
                System.out.println(">> Add Customer Info Is Finished << \n");
                power = false;
            } else {
                System.out.println("========================================");
                System.out.println(">> Add Customer Info Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                power = false;
            }

        } // while문

    } // addCustomerData()

    public void viewCustomerData() {
        Scanner sc = new Scanner(System.in);

        customerMethod.showCustomerList("For Viewing");
        System.out.print("--> Press Any Key To Back : ");
        sc.nextLine();
        System.out.println(" ");
        System.out.println(" ");

    } // viewCustomerData()

    public void updateCustomerData1() {
        boolean power = true;
        int serialNumForUpdate;
        while (power) {

            if (!customerMethod.showCustomerList("For Updating")) {
                System.out.println(" ");
                System.out.println(">> No Customer To Update <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            } else {
                try {
                    System.out.print("--> Serial_NO : UID-");
                    serialNumForUpdate = sc.nextInt();
                } catch (InputMismatchException e) {
                    serialNumForUpdate = -1;
                }

                switch (serialNumForUpdate) {
                    case 0:
                        System.out.println(" ");
                        System.out.println(">> Delete Of Customer Info Has Been Canceled <<");
                        System.out.println(" ");
                        System.out.println(" ");
                        power = false;
                        break;
                    case -1:
                        System.out.println(" ");
                        System.out.println(">> Invalid Input. Please try again <<");
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
                    default:
                        boolean check = false;
                        String[] updateIndex = new String[4];
                        for (String[] customerInfo : CustomerDTO.CustomerList) {
                            if (String.format("UID-%s", serialNumForUpdate).equals(customerInfo[0])) {
                                updateIndex = customerInfo;
                                check = true;
                                break;
                            }
                        }

                        if (check) {
                            updateCustomerData2(updateIndex);
                            power = false;
                            break;
                        } else {
                            System.out.println(" ");
                            System.out.println(">> There Is No Such Serial Number <<");
                            System.out.println(">> Please Do It Again <<");
                            System.out.println(" ");
                            System.out.println(" ");
                        }

                }
            }
        } // while문
    } // updateCustomerData1()

    public void updateCustomerData2(String[] updateIndex) {
        String userID;
        String spentTime;
        String totalPayment;
        while (true) {
            // 1-1. ID 수정
            userID = customerMethod.checkUserId();
            if (userID.equals("-1"))
                break;
            // 1-2. Spent Time  수정
            spentTime = customerMethod.checkSpentTime();
            if (spentTime.equals("-1"))
                break;
            // 1-3. Total Payment 수정
            totalPayment = customerMethod.checkTotalPayment();
            if (totalPayment.equals("-1"))
                break;
            // 1-4. Yes or No
            if (customerMethod.inputAreYouSure()) {
                String[] updateCustomerInfo = new String[]{updateIndex[0],userID, spentTime, totalPayment};
                CustomerDTO.CustomerList.set(CustomerDTO.CustomerList.indexOf(updateIndex), updateCustomerInfo);
                System.out.println(" ");
                System.out.println(">> Updating Is Completed <<");
                break;
            } else {
                System.out.println(" ");
                System.out.println(">> Updating Has Been Canceled <<");
            }
            System.out.println(" ");
            System.out.println(" ");
            break;
        } // while문
    } // updateCustomerData2()


    public void deleteCustomerData() {
        boolean power = true;
        while (power) {
            Scanner sc = new Scanner(System.in);
            int serialNumForDelete;

            if (!customerMethod.showCustomerList("For Deleting")) {
                System.out.println(" ");
                System.out.println(">> No Customer To Delete <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            } else {
                try {
                    System.out.print("--> Serial_NO : UID-");
                    serialNumForDelete = sc.nextInt();
                } catch (InputMismatchException e) {
                    serialNumForDelete = -1;
                }

                switch(serialNumForDelete) {
                    case 0:
                        System.out.println(" ");
                        System.out.println(">> Delete Of Customer Info Has Been Canceled <<");
                        System.out.println(" ");
                        System.out.println(" ");
                        power = false;
                        break;
                    case -1:
                        System.out.println(" ");
                        System.out.println(">> Invalid Input. Please try again <<");
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
                    default:
                        String check = "no";
                        String[] deleteIndex = new String[4];

                        for (String[] customerInfo : CustomerDTO.CustomerList) {
                            if (String.format("UID-%s", serialNumForDelete).equals(customerInfo[0])) {
                                deleteIndex = customerInfo;
                                check = "yes";
                                break;
                            }
                        }

                        if (check.equals("no")) {
                            System.out.println(" ");
                            System.out.println(">> There Is No Such Serial Number <<");
                            System.out.println(">> Please Do It Again <<");
                            System.out.println(" ");
                            System.out.println(" ");
                            break;
                        } else {
                            if (customerMethod.inputAreYouSure()) {
                                CustomerDTO.CustomerList.remove(deleteIndex);
                                System.out.println(" ");
                                System.out.println(">> Deleting Is Completed <<");
                            } else {
                                System.out.println(" ");
                                System.out.println(">> Deleting Has Been Canceled <<");
                            }
                            System.out.println(" ");
                            System.out.println(" ");
                            power = false;
                            break;
                        }
                }

            }
        } // while문
    } // deleteCustomerData


} // Customer Data