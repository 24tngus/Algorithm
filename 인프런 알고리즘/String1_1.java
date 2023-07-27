// 문자 찾기

import java.util.*;

public class String1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char c = in.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(c)) {
                str = str.toUpperCase();
            } else {
                str = str.toLowerCase();
            }
            if (str.charAt(i) == c)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}