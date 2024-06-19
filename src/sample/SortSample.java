package sample;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 入力された5つの引数をソートし、先頭からX番目の値を出力するクラス
 * ※出力対象となる番号は6番目の引数を使用する。
 */
public class SortSample {
	/**
	 * 6番目に入力された値が数字の場合は対応する配列から値を出力
	 * 6番目に数字以外または配列数よりも長い数字などが入力された場合はエラー文を返す。
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] SortList = new String[5];
		System.out.println("値を6つ入力してください。");
		// 入力された値をスペース区切りで受け取る
		SortList = scan.nextLine().split(" ");
		// 配列の長さが6以外の場合、エラーを出力
		int x = 1;
		if(SortList.length != 6) {
			System.out.println("設定された引数の数が正しくありません。確認の上再度実行してください。");
			return;
		} else {
			try {
				// 6番目に入力した数値に対応する文字を配列から取り出す
				x = Integer.parseInt(SortList[5]);
			} catch (NumberFormatException e) {
				System.out.println("6番目の引数は数字で設定してください。");
				scan.next();
			}
		}
		// 決められた配列の中で値を判別するため、1~6以外を無効とする。
		if(x < 1 || x > 7) {
			System.out.println("入力する整数は1~6の中で指定してください。");
			scan.next();
		}
		// 配列のx番目を出力
		System.out.println(SortList[5] + "番目の値は" + SortList[x] + "です。");
		Arrays.sort(SortList);
		System.out.println(Arrays.toString(SortList));
	}    
}
