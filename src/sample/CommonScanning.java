package sample;

import java.util.Scanner;

public class CommonScanning {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("数字同士の掛け算結果が出力されます、数字を入力してください");
		int number1 = scan.nextInt();
		System.out.println(number1 * number1);
	}

}
