package smartStoreFunction.tierSetting;

import DB.TierDTO;

import java.util.Scanner;

public class TierSetting {

    TierDTO tierDTO = new TierDTO();
    TierMethod tierMethod = new TierMethod();
    Scanner sc = new Scanner(System.in);

    public void viewTier() {
        System.out.println("========================================");
        System.out.printf("|%-38s|\n", " << View Tier >>");
        System.out.println("----------------------------------------");
        System.out.printf("|%-38s|\n", " < GENERAL Tier >");
        System.out.printf("|%-38s|\n", String.format("  - Minimum Spent Time : %d(hours)", tierDTO.getGeneralSpentTime()));
        System.out.printf("|%-38s|\n", String.format("  - Minimum Total Payment : %d(₩)", tierDTO.getGeneralTotalPayment()));
        System.out.println("----------------------------------------");
        System.out.printf("|%-38s|\n", " < VIP Tier >");
        System.out.printf("|%-38s|\n", String.format("  - Minimum Spent Time : %d(hours)", tierDTO.getVipSpentTime()));
        System.out.printf("|%-38s|\n", String.format("  - Minimum Total Payment : %d(₩)", tierDTO.getVipTotalPayment()));
        System.out.println("----------------------------------------");
        System.out.printf("|%-38s|\n", " < VVIP Tier >");
        System.out.printf("|%-38s|\n", String.format("  - Minimum Spent Time : %d(hours)", tierDTO.getVvipSpentTime()));
        System.out.printf("|%-38s|\n", String.format("  - Minimum Total Payment : %d(₩)", tierDTO.getVvipTotalPayment()));
        System.out.println("----------------------------------------");
        System.out.println("========================================");
        System.out.print("--> Press Any Key To Back : ");
        String anyKey = sc.nextLine();
        if (anyKey != null) {
            System.out.println(" ");
            System.out.println(" ");
        }

    } // viewTier()


    public void changeTier() {
        tierMethod.showSelectTier();
    }

} // TierSetting