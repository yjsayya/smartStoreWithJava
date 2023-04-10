package DB;

import java.util.ArrayList;

public class CustomerDTO {

    public static ArrayList<String[]> CustomerList = new ArrayList<>();

    public static ArrayList<String[]> othersList = new ArrayList<>();
    public static ArrayList<String[]> generalList = new ArrayList<>();
    public static ArrayList<String[]> vipList = new ArrayList<>();
    public static ArrayList<String[]> vvipList = new ArrayList<>();
    public static int num = 1;

    public CustomerDTO() {
        String[] info1 = new String[]{"UID-1", "sayya", "100", "100000"};
        String[] info2 = new String[]{"UID-2", "sua", "300000", "300"};
        String[] info3 = new String[]{"UID-3", "hongguer", "200", "200000"};
        String[] info4 = new String[]{"UID-4", "ye_coming", "300", "300000"};
    } // constructor

} // CustomerDTO

