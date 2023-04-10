package smartStoreFunction.summary;

import DB.TierDTO;

import java.util.Arrays;

import static DB.CustomerDTO.*;

public class SummaryMethod {

    TierDTO tierDTO = new TierDTO();

    public void arrangeCustomerList() {
        for (String[] customerInfo : CustomerList) {
            // 1. general 리스트에 넣기
            if (tierDTO.getGeneralSpentTime() <= Integer.parseInt(customerInfo[2])
                    && Integer.parseInt(customerInfo[2]) < tierDTO.getVipSpentTime()
                    && tierDTO.getGeneralTotalPayment() <= Integer.parseInt(customerInfo[3])
                    && Integer.parseInt(customerInfo[3]) < tierDTO.getVipTotalPayment())
                generalList.add(customerInfo);
            // 2. vip 리스트에 넣기
            else if (tierDTO.getVipSpentTime() <= Integer.parseInt(customerInfo[2])
                    && Integer.parseInt(customerInfo[2]) < tierDTO.getVvipSpentTime()
                    && tierDTO.getVipTotalPayment() <= Integer.parseInt(customerInfo[3])
                    && Integer.parseInt(customerInfo[3]) < tierDTO.getVvipTotalPayment())
                vipList.add(customerInfo);
            // 3. vvip 리스트에 넣기
            else if (tierDTO.getVvipSpentTime() <= Integer.parseInt(customerInfo[2])
                    && tierDTO.getVvipTotalPayment() <= Integer.parseInt(customerInfo[3]))
                vvipList.add(customerInfo);
            // 4. other 리스트에 넣기
            else
                othersList.add(customerInfo);

        } // for문
    } // arrangeCustomerList

    public void sortList(String sortingBy, String ascOrDesc) {

        switch(sortingBy) {
            case "UID":
                if (ascOrDesc.equals("asc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                } else if (ascOrDesc.equals("desc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                }
                break;
            case "userID":
                if (ascOrDesc.equals("asc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                } else if (ascOrDesc.equals("desc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                }
                break;
            case "spentTime":
                if (ascOrDesc.equals("asc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                } else if (ascOrDesc.equals("desc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                }
                break;
            case "totalPayment":
                if (ascOrDesc.equals("asc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                } else if (ascOrDesc.equals("desc")) {
                    System.out.println(Arrays.toString(vvipList.toArray()));
                    System.out.println(Arrays.toString(vipList.toArray()));
                    System.out.println(Arrays.toString(generalList.toArray()));
                    System.out.println(Arrays.toString(othersList.toArray()));
                }
                break;
        }

    }

    public void resetAllList() {
        vvipList.clear();
        vipList.clear();
        generalList.clear();
        othersList.clear();
    } // resetAllList


} // SummaryMethod