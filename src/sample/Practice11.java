package sample;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		System.out.println("整数を入力してください");
        int n = sc.nextInt();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
        	System.out.println("文字列を入力してください");
            s[i] = sc.next();
        }

        for (String t : s) {
            System.out.println(t);
        }
	}
}
