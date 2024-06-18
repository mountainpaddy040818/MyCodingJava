package sample;

import java.util.Scanner;

public class SortSample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] SortList = new String[6];
		System.out.println("6つの値を入力してください");
		for(int i = 0; i < 6; i++) {
			SortList[i] = scan.next();
		}
		
		for(int i = 0; i < 6; i++) {
			if (i == 5) {
				if ((SortList[i]) == "a") {
					System.out.println("6番目の引数は数字で設定してください。");
				} else {
					System.out.println("6番目の値は、" + SortList[i] + "です。");
				}
			} else if (SortList[i] != "a") {
				System.out.println("設定された引数の数が正しくありません。確認の上再度実行してください。");
				break;
			}
		}
	}    
}
