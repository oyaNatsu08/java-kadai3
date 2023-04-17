package kadai3;

import java.util.Scanner;

public class StringCompare02 {
    public static void main(String[] args) {
        System.out.println("文字列を入力してください。");

        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = sc.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("入力値が一致しました");
        } else {
            System.out.println("入力値が一致しません");
        }

        sc.close();
    }
}
