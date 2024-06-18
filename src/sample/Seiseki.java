package sample;

import java.util.Scanner;

//各教科の点数を入力して、合計と平均点を求めるクラス
public class Seiseki {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kamoku = {"国語", "数学", "社会", "理科", "英語"};
		int[] seiseki = new int[5];
		int gokei = 0;
		for(int i = 0; i < kamoku.length; i++) {
			System.out.println(kamoku[i] + "の点数を入力してください。");	
//			while(true)で入力された値がint型か否か確認
			while(true) {
				if(scan.hasNextInt()) {
//					各教科の点数を入力してください
					seiseki[i] = scan.nextInt();
					if(seiseki[i] >= 0 && seiseki[i] <= 100) {
						break;
					} else if(seiseki[i] < 0) {
						System.out.println("マイナス点です。もう一度入力してください。");
					} else if(seiseki[i] > 100) {
						System.out.println("101点以上です。もう一度入力してください。");
					} else {
						System.out.println("もう一度入力してください。");
					}
				} else {
					System.out.println("自然数ではありません。もう一度入力してください。");
					scan.next();
				}
			}
//			seiseki[i]を順番に足して合計算出
			gokei += seiseki[i];
//			heikin変数をdouble型とすることで小数点まで算出
			double heikin = gokei / seiseki[i];
		}
		double heikin = gokei / 5.0;
		System.out.println("合計：" + gokei + "点です。");
		System.out.println("平均点：" + heikin + "点です。");
	}
}
