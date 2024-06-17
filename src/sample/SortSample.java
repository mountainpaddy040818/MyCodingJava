package sample;

import java.util.Scanner;

public class SortSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int[] SortList = new int[6];
		System.out.println("6つの値を入力してください");
		for(int i = 0; i < 6; i++) {
			SortList[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 6; i++) {
			if (i == 5) {
				if (!isInteger(SortList[i])) {
					System.out.println("6番目の引数は数字で設定してください。");
				} else {
					System.out.println("6番目の値は、" + SortList[i] + "です。");
				}
			} else if (SortList[i] != 6) {
				System.out.println("設定された引数の数が正しくありません。確認の上再度実行してください。");
			}
		}
	}
	
	public static boolean isInteger(int value) {
        try {
            Integer.parseInt(String.valueOf(value));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
	}    
}
