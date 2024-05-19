package sample;

import java.util.Scanner;

public class PracticePart2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int number = scan.nextInt();
		if (number % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}

}
