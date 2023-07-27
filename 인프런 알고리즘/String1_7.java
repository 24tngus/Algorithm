// 회문 문자열

import java.util.*;

public class String1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine().toUpperCase();
        String[] arr = str.split("");
        int len = arr.length - 1;

        for (int i = 0; i < len / 2; i++) {
            char c1 = arr[i].charAt(0);
            char c2 = arr[len - i].charAt(0);
            if (isSameChar(c1, c2) != 1) {
                System.out.println("NO");
                return ; 
            }
        }
        System.out.println("YES");
        in.close();
    }

    public static int isSameChar(char c1, char c2) {
        if (c1 == c2)
            return (1);
        else
            return (0);
    }
}

