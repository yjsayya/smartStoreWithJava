package smartStoreFunction.tierSetting;

import DB.TierDTO;

import java.util.Scanner;

import java.util.InputMismatchException;

public class TierMethod {

    TierDTO tierDTO = new TierDTO();
    Scanner sc = new Scanner(System.in);

    public void showSelectTier() {
        boolean power = true;
        while(power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Select Tier >>");
            System.out.println("----------------------------------------");
            System.out.printf("|%-38s|\n", " 1. General");
            System.out.printf("|%-38s|\n", " 2. VIP");
            System.out.printf("|%-38s|\n", " 3. VVIP");
            System.out.printf("|%-38s|\n", " 4. Back");
            System.out.println("========================================");
            System.out.print("--> Choose One: ");
            int index = 0;
            try {
                index = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                index = 6;
            }

            switch (index) {
                case 1:
                    changeGeneralTier();
                    continue;
                case 2:
                    changeVipTier();
                    continue;
                case 3:
                    changeVvipTier();
                    continue;
                case 4:
                    System.out.println(" ");
                    System.out.println(" ");
                    power = false;
                    break;
                default:
                    System.out.println(">> Invalid Input. Please try again <<");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            } // switch

        }// while문
    } // selectTier()


    public void changeGeneralTier() {
        while (true) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << GENERAL Tier >>");
            System.out.printf("|%-38s|\n", String.format("  - Minimum Spent Time : %d(hours)", tierDTO.getGeneralSpentTime()));
            System.out.printf("|%-38s|\n", String.format("  - Minimum Total Payment : %d(₩)", tierDTO.getGeneralTotalPayment()));
            System.out.printf("|%-38s|\n", " (Press '-1' To Exit)");
            System.out.println("----------------------------------------");
            // 1. Spent Time 입력
            int spentTime = inputSpentTime();
            if (spentTime == -1) {
                System.out.println("----------------------------------------");
                System.out.println(">> Changing Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 2. Total Payment 입력
            int totalPayment = inputTotalPayment();
            if (totalPayment == -1) {
                System.out.println("----------------------------------------");
                System.out.println(">> Changing Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 3. 다른 Tier 값과 비교
            if (spentTime < tierDTO.getVipSpentTime() && totalPayment < tierDTO.getVipTotalPayment()) {
                tierDTO.setGeneralSpentTime(spentTime);
                tierDTO.setGeneralTotalPayment(totalPayment);
                System.out.println("----------------------------------------");
                System.out.println(">> Changing GENERAL Tier Is Successful <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            } else {
                System.out.println(" ");
                System.out.println(">> GENERAL Tier Must Be Lower Than Other Tiers <<");
                System.out.println(">> Plead Do It Again <<");
                System.out.println(" ");
                System.out.println(" ");
            }

        } // while문
    } // changeGeneralTier

    public void changeVipTier() {
        while (true) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << VIP Tier >>");
            System.out.printf("|%-38s|\n", String.format("  - Minimum Spent Time : %d(hours)", tierDTO.getVipSpentTime()));
            System.out.printf("|%-38s|\n", String.format("  - Minimum Total Payment : %d(₩)", tierDTO.getVipTotalPayment()));
            System.out.printf("|%-38s|\n", " (Press '-1' To Exit)");
            System.out.println("----------------------------------------");
            // 1. Spent Time 입력
            int spentTime = inputSpentTime();
            if (spentTime == -1) {
                System.out.println("----------------------------------------");
                System.out.println(">> Changing Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 2. Total Payment 입력
            int totalPayment = inputTotalPayment();
            if (totalPayment == -1) {
                System.out.println("----------------------------------------");
                System.out.println(">> Changing Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }

            // 3. 다른 Tier와 값 비교
            if (tierDTO.getGeneralSpentTime() < spentTime && spentTime < tierDTO.getVvipSpentTime() &&
                       tierDTO.getGeneralTotalPayment() < totalPayment && totalPayment < tierDTO.getVvipTotalPayment()) {
                tierDTO.setVipSpentTime(spentTime);
                tierDTO.setVipTotalPayment(totalPayment);
                System.out.println("----------------------------------------");
                System.out.println(">> Changing VIP Tier Is Successful <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            } else {
                System.out.println(" ");
                System.out.println(">> VIP Tier Must Be Higher Than General Tier <<");
                System.out.println(">>    &&  Must Be Lower Than VVIP Tier <<");
                System.out.println(">> Please Do It Again <<");
                System.out.println(" ");
                System.out.println(" ");
            }

        } // while문
    } // changeVipTier

    public void changeVvipTier() {
        while (true) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << VIP Tier >>");
            System.out.printf("|%-38s|\n", String.format("  - Minimum Spent Time : %d(hours)", tierDTO.getVvipSpentTime()));
            System.out.printf("|%-38s|\n", String.format("  - Minimum Total Payment : %d(₩)", tierDTO.getVvipTotalPayment()));
            System.out.printf("|%-38s|\n", " (Press '-1' To Exit)");
            System.out.println("----------------------------------------");
            // 1. Spent Time 입력
            int spentTime = inputSpentTime();
            if (spentTime == -1) {
                System.out.println(">> Changing Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 2. Total Payment 입력
            int totalPayment = inputTotalPayment();
            if (totalPayment == -1) {
                System.out.println(">> Changing Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 3. 다른 Tier와 값 비교
            if (spentTime > tierDTO.getVipSpentTime() && totalPayment > tierDTO.getVipTotalPayment()) {
                tierDTO.setVvipSpentTime(spentTime);
                tierDTO.setVvipTotalPayment(totalPayment);
                System.out.println(">> Changing VVIP Tier Is Successful <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            } else {
                System.out.println(">> VVIP Tier Must Be Higher Than Other Tiers <<");
                System.out.println(">> Please Do It Again <<");
                System.out.println(" ");
                System.out.println(" ");
            }

        } // while문
    } // changeVvipTier


    public int inputSpentTime() {
        int spentTime = -3;
        while(true) {
            System.out.print("--> Input Minimum Spent Time : ");
            try {
                spentTime = sc.nextInt();
            } catch (InputMismatchException e) {
                spentTime = -2;
            }
            // 취소
            if (spentTime == -1) {
                break;
            } else if (spentTime == -2) {
                System.out.println(" ");
                System.out.println(">> Invalid Input. Please try again <<");
                System.out.println(" ");
                continue;
            } else {
                break;
            }
        } // while문
        return spentTime;
    } // inputSpentTime

    public int inputTotalPayment() {
        int totalPayment = 0;
        while(true) {
            System.out.print("--> Input Minimum Total Payment : ");
            try {
                totalPayment = sc.nextInt();
            } catch (InputMismatchException e) {
                totalPayment = -2;
            }
            // 취소
            if (totalPayment == -1) {
                break;
            } else if (totalPayment == -2) {
                System.out.println(" ");
                System.out.println(">> Invalid Input. Please try again <<");
                System.out.println(" ");
            } else {
                break;
            }
        } // while문
        return totalPayment;
    } // inputSpentTime

} // TierMethod