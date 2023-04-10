package member;

import DB.MemberDTO;

import java.util.Scanner;

public class SignUp {

    Scanner sc = new Scanner(System.in);
    MemberMethod memberMethod = new MemberMethod();
    MemberDTO memberDTO = new MemberDTO();


    public void inputSignUpInfo() {
        String loginID;
        String loginPW;
        String loginName;
        String phoneNumber;
        boolean power = true;
        while(power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Sign Up Page >>");
            System.out.printf("|%-38s|\n", " (Press '-1' Tp Exit)");
            System.out.println("----------------------------------------");
            // 1. login ID 입력
            loginID = memberMethod.checkLoginIdWhetherItIsOkay();
            if (loginID.equals("-1")) {
                System.out.println(">> Sign Up Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 2. loginPW 입력
            loginPW = memberMethod.checkLoginPwWhetherItIsOkay();
            if (loginPW.equals("-1")) {
                System.out.println("----------------------------------------");
                System.out.println(">> Sign Up Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 3. loginName 입력
            loginName = memberMethod.checkLoginNameWhetherItIsOkay();
            if (loginName.equals("-1")) {
                System.out.println("----------------------------------------");
                System.out.println(">> Sign Up Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 4.
            phoneNumber = memberMethod.checkPhoneNumberWhetherItIsOkay();
            if(phoneNumber.equals("-1")) {
                System.out.println("----------------------------------------");
                System.out.println(">> Sign Up Has Been Canceled <<");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }

            memberMethod.signUp(loginID, loginPW, loginName, phoneNumber);
            System.out.println("----------------------------------------");
            System.out.println(">> Sign Up Is Completed <<");
            System.out.println(" ");
            System.out.println(" ");
            power = false;

        } // while문
    } // inputMemberInfo()

} // Sign Up