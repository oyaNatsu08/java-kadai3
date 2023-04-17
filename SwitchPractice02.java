package kadai3;

import java.util.Scanner;

public class SwitchPractice02 {
    public static void main(String[] args) {
        System.out.println("文字列を入力してください。");

        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        System.out.print("東京まで ");
        switch (s1) {
            case "品川" :
                System.out.print("田町 ");
            case "田町" :
                System.out.print("浜松町 ");
            case "浜松町" :
                System.out.print("新橋 ");
            case "新橋" :
                System.out.print("有楽町 ");
            default :
                System.out.println("を通過します");
        }
    }
}
