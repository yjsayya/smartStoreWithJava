package member;

import DB.MemberDTO;
import smartStoreFunction.*;
import java.util.Scanner;

public class Login {

    Scanner sc = new Scanner(System.in);
    MemberMethod memberMethod = new MemberMethod();
    MemberDTO memberDTO = new MemberDTO();
    MainMenu mainMenu = new MainMenu();

    public void inputLoginInfo() {
        memberDTO.getMemberList();
        boolean power = true;
        while(power) {
            System.out.println("========================================");
            System.out.printf("|%-38s|\n", " << Login Page >>");
            System.out.printf("|%-38s|\n", " (Press '-1' Tp Exit)");
            System.out.println("----------------------------------------");
            // 1. ID 입력
            System.out.print("--> ID : ");
            String loginID_ = sc.nextLine();
            if (loginID_.equals("-1")) {
                System.out.println("========================================");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            // 2. PW 입력
            System.out.print("--> PW : ");
            String loginPW_ = sc.nextLine();
            if (loginPW_.equals("-1")) {
                System.out.println("========================================");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            System.out.println("========================================");
            System.out.println(" ");
            System.out.println(" ");

            // 3. 아이디 비밀번호 일치하는지 확인
            if (memberMethod.checkLoginInfo(loginID_, loginPW_)) {
                // 확인이 됐으면 - 세션에 저장하고 통과
                System.out.println(String.format(">> Welcome %s <<", memberDTO.getSession()));
                System.out.println(">> It's SmartStore <<");
                System.out.println(" ");
                System.out.println(" ");
                // 로그인 --> 메인페이지로 이동
                mainMenu.printMainMenu();
                System.out.println(String.format(">> Good Bye %s <<", memberDTO.getSession()));
                System.out.println(" ");
                System.out.println(" ");
                power = false;

            } else {
                System.out.println(">> Input is not correct <<");
                System.out.println(">> Please Do It Again <<");
                System.out.println(" ");
                System.out.println(">> If You're Not Member <<");
                System.out.println(">> Please Sign Up First <<");
                System.out.println(" ");
                System.out.println(" ");
            }

        } // while문
    } // inputLoginInfo()


} // Login