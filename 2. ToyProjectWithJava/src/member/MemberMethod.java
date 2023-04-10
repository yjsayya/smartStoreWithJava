package member;

import java.util.HashMap;

import DB.MemberDTO;

import java.util.Scanner;

public class MemberMethod {

    Scanner sc = new Scanner(System.in);
    MemberDTO memberDTO = new MemberDTO();

    // 로그인 정보 확인하기
    public boolean checkLoginInfo(String loginID, String loginPW) {
        boolean loginCheck = false;
        for (HashMap<String, String> member : MemberDTO.MemberList) {
            if (loginID.equals(member.get("loginID")) && loginPW.equals(member.get("loginPW"))) {
                loginCheck = true;
                memberDTO.setSession(member.get("loginName"));
                break;
            }
        }
        return loginCheck;
    }


    public void signUp(String loginID, String loginPW, String loginName, String phoneNumber) {
        HashMap<String, String> member = new HashMap<>();

        member.put("loginID", loginID);
        member.put("loginPW", loginPW);
        member.put("loginName", loginName);
        member.put("phoneNumber", phoneNumber);

        MemberDTO.MemberList.add(member);
    }

    public String checkLoginIdWhetherItIsOkay() {
        String loginID;
        while (true) {
            System.out.print("--> ID : ");
            String loginID_ = sc.nextLine();

            if (loginID_.matches("^[a-zA-Z][a-zA-Z0-9]{4,16}$")) {
                loginID = loginID_;
                break;
            } else if (loginID_.equals("-1")){
                loginID = "-1";
                break;
            } else {
                System.out.println(" ");
                System.out.println(">> Invalid Input. Please Do It again <<");
                System.out.println(">> Your ID Must Be Combination Of Alphabet And Numbers<<");
                System.out.println(">> Between 4 And 16 Letters<<");
                System.out.println(" ");
            }
        } // while문
        return loginID;
    } // checkLoginIdWhetherItIsOkay()

    public String checkLoginPwWhetherItIsOkay() {
        String loginPW;
        while (true) {
            System.out.print("--> PW : ");
            String loginPW_ = sc.nextLine();

            if (loginPW_.matches("^[a-zA-Z][a-zA-Z0-9]{4,16}$")) {
                loginPW = loginPW_;
                break;
            } else if (loginPW_.equals("-1")){
                loginPW = "-1";
                break;
            } else {
                System.out.println(" ");
                System.out.println(">> Invalid Input. Please Do It again <<");
                System.out.println(">> Your Password Must Be Combination Of Alphabet And Numbers<<");
                System.out.println(">> Between 4 And 16 Letters<<");
                System.out.println(" ");
            }
        } // while문
        return loginPW;
    } // checkLoginPwWhetherItIsOkay()

    public String checkLoginNameWhetherItIsOkay() {
        String loginName;
        while (true) {
            System.out.print("--> Nick Name : ");
            String loginName_ = sc.nextLine();

            if (loginName_.matches("^[a-zA-Z0-9]{4,16}$")) {
                loginName = loginName_;
                break;
            } else if (loginName_.equals("-1")){
                loginName = "-1";
                break;
            } else {
                System.out.println(" ");
                System.out.println(">> Invalid Input. Please Do It again <<");
                System.out.println(">> Your Nick Name Must Be Combination Of Alphabet And Numbers<<");
                System.out.println(">> Between 4 And 16 Letters<<");
                System.out.println(" ");
            }
        } // while문
        return loginName;
    } // checkLoginNameWhetherItIsOkay()

    public String checkPhoneNumberWhetherItIsOkay() {
        String phoneNumber;
        while (true) {
            System.out.print("--> phoneNumber : ");
            String phoneNumber_ = sc.nextLine();

            if (phoneNumber_.matches("^[0-9]{11}$")) {
                phoneNumber = phoneNumber_;
                break;
            } else if (phoneNumber_.equals("-1")){
                phoneNumber = "-1";
                break;
            } else {
                System.out.println(" ");
                System.out.println(">> Invalid Input. Please Do It again <<");
                System.out.println(">> Please Input It Without '-' <<");
                System.out.println(" ");
            }
        } // while문
        return phoneNumber;
    } // checkPhoneNumberWhetherItIsOkay()


} // MemberMethod()