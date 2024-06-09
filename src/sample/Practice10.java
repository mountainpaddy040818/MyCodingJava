package sample;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("西暦を入力してください");
		int seireki = scan.nextInt();
		System.out.println("出力する年数を入力してください");
		int kikan = scan.nextInt();
		for(int i = 0; i < kikan; i++) {
			int seireki2 = seireki + i;
			System.out.print("西暦" + seireki2 + "年は、");
			int heisei = seireki2 - 1988;
			if(heisei == 1) {
				System.out.println("平成元年です。");
			} else {
				System.out.println("平成" + heisei + "年です。");
			}
		}
	}
}
