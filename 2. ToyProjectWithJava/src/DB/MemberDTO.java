package DB;

import java.util.ArrayList;
import java.util.HashMap;

public class MemberDTO {

    public static ArrayList<HashMap<String, String>> MemberList = new ArrayList<>();

    private static String session;


    public void getMemberList() {
        HashMap<String, String> defaultMember = new HashMap<>();
        defaultMember.put("loginID", "must");
        defaultMember.put("loginPW", "1234");
        defaultMember.put("loginName", "sayya");
        defaultMember.put("phoneNumber", "010-2523-4917");

        MemberList.add(defaultMember);
    }

    // getter
    public String getSession() {
        return session;
    }

    // setter
    public void setSession(String session) {
        this.session = session;
    }


} // Member DTO