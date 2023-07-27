// 단어 뒤집기

import java.util.*;

public class String1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.next();
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.println();
        }
        in.close();
    }
}
