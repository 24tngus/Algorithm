// 유효한 팰린드롬

import java.util.*;

public class String1_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine().toUpperCase();
        String[] arr = str.split("");
        String[] result = new String[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = (int) str.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                result[count++] = arr[i];
            }
        }
        for (int i = 0; i < count / 2; i++) {
            int len = count - 1;
            char c1 = result[i].charAt(0);
            char c2 = result[len - i].charAt(0);
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
