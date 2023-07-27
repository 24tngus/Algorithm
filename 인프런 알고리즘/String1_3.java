// 문장 속 단어

import java.util.*;

public class String1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] arr = str.split(" ");
        int max = 0;
        String answer = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            int count = arr[i].length();
            if (count > max) {
                max = count;
                answer = arr[i];
            }
        }
        System.out.println(answer);
        in.close();
    }
}
