package sample;

import java.util.Scanner;

//	入力された2つの値を比較し大きい方の値を表示する
public class ChkInputNumber {
	private static final int DefNumber = 3;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("一つ目の整数を入力してください。");
		String number1 = scan.next();
		System.out.println("二つ目の整数を入力してください。");
		String number2 = scan.next();
		
		if(number1 == null) {
			if(DefNumber > Integer.parseInt(number2)) {
				System.out.println("大きい値は" + DefNumber + "です。");
			} else if(DefNumber < Integer.parseInt(number2)) {
				System.out.println("大きい値は" + number2 + "です。");
			} else {
				System.out.println(DefNumber + "," + number2 + "は等しい整数です。");
			}
		} else if(number2 == null) {
			if(DefNumber > Integer.parseInt(number1)) {
				System.out.println("大きい値は" + DefNumber + "です。");
			} else if(DefNumber < Integer.parseInt(number1)) {
				System.out.println("大きい値は" + number1 + "です。");
			} else {
				System.out.println(DefNumber + "," + number1 + "は等しい整数です。");
			}
		} else if(Integer.parseInt(number1) > Integer.parseInt(number2)) {
			System.out.println("大きい値は" + number1 + "です。");
		} else if(Integer.parseInt(number1) < Integer.parseInt(number2)) {
			System.out.println("大きい値は" + number2 + "です。");
		} else {
			System.out.println(number1 + "," + number2 + "は等しい整数です。");
		}
	}
}
