package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 国語,数学,社会,理科,英語5教科の点数を入力する。
 * その際、整数以外や未入力、 101点以上の点数であった場合、メッセージを出力して再入力を促す。
 * 全教科の点数が入力された後、その合計点と平均点の算出結果を画面に出力する。 
 * 平均点は小数点第一位以下まで算出する。
 */
public class Seiseki {
	/**
	 *  定義した定数配列（各科目の名称）をmainメソッド内で使用する。
	 */
	public static final List<String> KAMOKU = 
			Collections.unmodifiableList(Arrays.asList("国語","数学","社会","理科","英語"));
	/**
	 * mainメソッド内で各科目の合計点、平均点を計算し算出する。
	 * 入力された値が0~100以外の場合は無効とする。
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5科目の点数を格納するための変数配列
		int[] seiseki1 = new int[5];
		// 5科目の合計点数を算出するための変数
		int gokei = 0;
		// 配列から各科目を取り出し、ループで点数を格納していく
		for(int i = 0; i < KAMOKU.size(); i++) {
			System.out.println(KAMOKU.get(i) + "の点数を入力してください。");
			// 入力された値が0以上か否か確認
			while(seiseki1[i] >= 0) {
				// 入力された値に対して、0~100点の中で処理がされているか
				if(scan.hasNextInt()) {
					// 各教科の点数を入力してください
					seiseki1[i] = scan.nextInt();
					if(seiseki1[i] >= 0 && seiseki1[i] <= 100) {
						break;
					} else if(seiseki1[i] < 0) {
						System.out.println("マイナス点です。もう一度入力してください。");
					} else if(seiseki1[i] > 100) {
						System.out.println("101点以上です。もう一度入力してください。");
					}
				} else {
					System.out.println("非負整数の中でもう一度入力してください。");
					scan.next();
				}
			}	
			// 配列の変数を通常の変数に変更
			int seiseki2 = seiseki1[i];
			
			// seiseki2を順番に足して各教科の合計算出
			gokei += seiseki2;
		}
		// 5で割るという意味合いで命名しました。
		double DevideByFive = 5.0;
		// heikin変数をdouble型とすることで小数点第一位まで算出
		double heikin = gokei / DevideByFive;
		System.out.println("合計：" + gokei + "点です。" + "平均：" + heikin + "点です。");
	}
}
