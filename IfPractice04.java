package kadai3;

import java.util.Scanner;

public class IfPractice04 {
    public static void main(String[] args) {
        System.out.println("数値を入力してください。");

        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num = Integer.parseInt(s1);

        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            System.out.println("閏年です");
        }

//        if (num % 400 == 0) {
//            System.out.println("閏年です");
//        } else if (num % 100 == 0) {
//
//        } else if (num % 4 == 0) {
//            System.out.println("閏年です");
//        }

//        if (num % 4 == 0) {
//            if (num % 400 == 0) {
//                System.out.println("閏年です");
//            } else if (num % 100 == 0) {
//
//            } else {
//                System.out.println("閏年です");
//            }
//        }

        sc.close();
    }
}
