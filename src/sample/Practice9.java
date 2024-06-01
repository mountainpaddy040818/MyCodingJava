package sample;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("一つ目の数字を入力してください");
		int number1 = scan.nextInt();
		System.out.println("二つ目の数字を教えてください");
		int number2 = scan.nextInt();
		System.out.println("三つ目の数字を教えてください");
		int number3 = scan.nextInt();
		
		int max = number1;
		
		if (number2 > max) {
			max = number2;
		}
		
		if (number3 > max) {
			max = number3;
		}
		
		System.out.println("最大の値は" + max + "です。");
	}
}
