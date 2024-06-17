package sample;

import java.util.Scanner;

public class Seiseki {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String[] kamoku = {"国語", "数学", "社会", "理科", "英語"};
		int[] seiseki = new int[5];
		int gokei = 0;
		for(int i = 0; i < kamoku.length; i++) {
			System.out.println(kamoku[i] + "の点数");
			while(true) {
				if(scan.hasNextInt()) {
					seiseki[i] = scan.nextInt();
					if(seiseki[i] >= 0 && seiseki[i] <= 100) {
						break;
					} else if(seiseki[i] < 0) {
						System.out.println("マイナス点です。もう一度入力してください。");
					} else if(seiseki[i] > 100) {
						System.out.println("100点以上です。もう一度入力してください。");
					}
				} else {
					System.out.println("数字ではありません。もう一度入力してください。");
					scan.next();
				}
			}
			gokei += seiseki[i];
			double heikin = gokei / seiseki[i];
		}
		double heikin = gokei / kamoku.length;
		System.out.println("合計：" + gokei + "点です。");
		System.out.println("平均点：" + heikin + "点です。");
	}
}
