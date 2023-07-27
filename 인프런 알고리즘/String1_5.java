// 특정 문자 뒤집기

import java.util.*;

public class String1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = in.next().split("");
        String[] result = new String[arr.length];

        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            int c = (int)arr[i].charAt(0);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                result[j++] = arr[i];
            }
        }
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = (int)arr[i].charAt(0);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                System.out.print(result[j++]);
            } else {
                System.out.print(arr[i]);
            }
        }
        in.close();
    }
}
