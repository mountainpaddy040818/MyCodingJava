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
	 * 科目の名称
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
		// 合計点数
		int gokei = 0;
		// 配列から各科目を取り出し、ループで点数を格納していく
		for(int i = 0; i < KAMOKU.size(); i++) {
			int seiseki = 0;
			// 0~100までの数字が否である時。
			boolean NumOfZeroToHundred = false;
			// 0~100までの数字が入力されない限り、ループを抜けない。
			while(!NumOfZeroToHundred) {
				System.out.println(KAMOKU.get(i) + "の点数を入力してください。");
				// 0~100までの数字が入力されているか。
				if(scan.hasNextInt()) {
					seiseki = scan.nextInt();
					if(seiseki >= 0 && seiseki <= 100) {
						System.out.println(KAMOKU.get(i) + "：" + seiseki + "点");
						NumOfZeroToHundred = true;
					} else if(seiseki < 0) {
						System.out.println("マイナス点です。もう一度入力してください。");
					} else if(seiseki > 100) {
						System.out.println("101点以上です。もう一度入力してください。");
					}
				} else {
					System.out.println("非負整数の中でもう一度入力してください。");
					scan.next();
				}
			}
			// 順番に足して各科目の合計算出
			gokei += seiseki;
		}
		// 科目数で割るという意味。
		int DevideBySubjects = KAMOKU.size();
		// 変数を浮動小数型とすることで小数点第一位まで算出
		double heikin = (double)gokei / DevideBySubjects;
		System.out.println("合計：" + gokei + "点、" + "平均：" + heikin + "点です。");
	}
}
