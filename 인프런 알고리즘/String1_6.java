// 중복문자제거

import java.util.*;

public class String1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = in.next().split("");
        String[] answer = new String[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isChar(answer, arr[i].charAt(0), count) == 1) {
                continue;
            } else {
                answer[count++] = arr[i];
                System.out.print(arr[i]);
            }
        }
        in.close();
    }

    public static int isChar(String[] answer, char c, int count) {
        for (int i = 0; i < count; i++) {
            if (answer[i].charAt(0) == c)
                return (1);
        }
        return (0);
    }
}
