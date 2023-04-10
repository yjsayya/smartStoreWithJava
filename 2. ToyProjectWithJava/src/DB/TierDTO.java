package DB;

public class TierDTO {

    private static int generalSpentTime = 100;
    private static int generalTotalPayment = 100_000;

    private static int vipSpentTime = 200;
    private static int vipTotalPayment = 200_000;

    private static int vvipSpentTime = 300;
    private static int vvipTotalPayment = 300_000;

    int generalSpentTime1;
    int generalTotalPayment1;

    int vipSpentTime1;
    int vipTotalPayment1;

    int vvipSpentTime1;
    int vvipTotalPayment1;


    // constructor
    public TierDTO() {
        this.generalSpentTime1 = 100;
        this.generalTotalPayment1 = 100_000;

        this.vipSpentTime1 = 200;
        this.vipTotalPayment1 = 200_000;

        this.vvipSpentTime1 = 300;
        this.vvipTotalPayment1 = 300_000;
    }

    // Getter && Setter
    public int getGeneralSpentTime() {
        return TierDTO.generalSpentTime;
    }

    public void setGeneralSpentTime(int generalSpentTime) {
        TierDTO.generalSpentTime = generalSpentTime;
    }

    public int getGeneralTotalPayment() {
        return TierDTO.generalTotalPayment;
    }

    public void setGeneralTotalPayment(int generalTotalPayment) {
        TierDTO.generalTotalPayment = generalTotalPayment;
    }

    public int getVipSpentTime() {
        return vipSpentTime;
    }

    public void setVipSpentTime(int vipSpentTime) {
        TierDTO.vipSpentTime = vipSpentTime;
    }

    public int getVipTotalPayment() {
        return TierDTO.vipTotalPayment;
    }

    public void setVipTotalPayment(int vipTotalPayment) {
        TierDTO.vipTotalPayment = vipTotalPayment;
    }

    public int getVvipSpentTime() {
        return TierDTO.vvipSpentTime;
    }

    public void setVvipSpentTime(int vvipSpentTime) {
        TierDTO.vvipSpentTime = vvipSpentTime;
    }

    public int getVvipTotalPayment() {
        return TierDTO.vvipTotalPayment;
    }

    public void setVvipTotalPayment(int vvipTotalPayment) {
        TierDTO.vvipTotalPayment = vvipTotalPayment;
    }

} // TierDTO