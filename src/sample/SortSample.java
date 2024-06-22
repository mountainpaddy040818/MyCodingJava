package sample;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 入力された5つの引数をソートし、先頭からX番目の値を出力するクラス
 * 
 * ※出力対象となる番号は6番目の引数を使用する。
 */
public class SortSample {
	
	/**
	 * 他のメソッドでも同じ定数を再利用できるようにするため
	 */
	private static final int SIZE = 5;
	
	/**
	 * メソッド間のデータのやり取りを容易にするため
	 */
	private String[] sortList = new String[SIZE];
	
	/**
	 * 6番目に入力された値が数字の場合は対応する配列から値を出力
	 * 
	 * 6番目に数字以外または配列数よりも長い数字などが入力された場合はエラー文を返す。
	 * 
	 * @param args 実行時の引数。引数は不要。すべての入力は実行時にコンソールから行われる。
	 */
	public static void main(String[] args) {
		SortSample s = new SortSample();
		s.start(args);
	}
	
	/**
	 * 下記メソッドをmainメソッドに挿入する。
	 * 
	 * @param args 実行時の引数。引数は不要。すべての入力は実行時にコンソールから行われる。
	 */
	private void start(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("5つの値を入力してください。");
		String scanArray = scan.nextLine();
		String[] array = scanArray.split(" ");
		
		if(array.length != SIZE) {
			System.out.println("設定された引数の数が正しくありません。確認の上再度実行してください。");
			return;
		}
		for(int i = 0; i < SIZE; i++) {
			// 入力された値をスペース区切りで受け取る
			sortList[i] = array[i].trim();
		}
		// 確認として入力された値を出力する。
		System.out.println("入力された値：" + Arrays.toString(sortList));
		// 配列を昇順に変更
		Arrays.sort(sortList);
		// 昇順にソートされた配列を出力する。
		System.out.println("昇順：" + Arrays.toString(sortList));
		// 6番目に入力する1~5までの整数
		int x = -1;
		// 数字が1~5の整数なのか確認
		boolean isInputInt = false;
		System.out.println("出力する引数の番号を1~5の範囲で入力してください。");
		// 1~5の整数が入力されるまで、ループを抜けない。
		while(!isInputInt) {
			// 1~5の数字が入力されているか
			if(scan.hasNextInt()) {
				x = scan.nextInt();
				// 1~5の数字が入力された場合は正常文を出力してループを抜ける。
				if(x >= 1 && x <= 5) {
					System.out.println(x + "番目の値は" + "”" + sortList[x - 1] + "”" + "です。");
					isInputInt = true;
				} else {
					System.out.println("1~5の範囲で入力してください。");
				}	
			} else {
					System.out.println("6番目の引数は整数（半角または全角）で入力してください。");
					scan.next();
			}
		}
		scan.close();
	}
}
