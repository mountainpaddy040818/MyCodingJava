package sample;

import java.util.Scanner;

//入力された社員名及び社員番号を表示するクラス
public class OutPutEmpInfo {
	
	/**
	 * 社員番号を入力されなかった場合のデフォルト値
	 */
	private static final int DefEmpNumber = 999999999;
	
	/**
	 * 
	 * @param args　実行時の引数。引数は不要。すべての入力は実行時にコンソールから行われる。
	 */
	public static void main(String[] args) {
		OutPutEmpInfo empInfo = new OutPutEmpInfo();
		empInfo.start();
	}
	
	private void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("名前と社員番号をカンマ区切りで入力してください。");
		
		String input = scan.nextLine();
		String[] inputs = input.split(",");
		
		switch(inputs.length) {
			case 0:
				System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
				break;
			case 1:
				OutPutEmpInfo(inputs[0]);
				break;
			case 2:
				OutPutEmpInfo(inputs[0], inputs[1]);
				break;
			default:
				System.out.println("引数が多く設定されているため、余計な引数を無視します。");
				OutPutEmpInfo(inputs[0], inputs[1]);
				break;
		}
		scan.close();
	}
	
	/**
	 * 
	 * @param name　引数は社員の名前
	 */
	private void OutPutEmpInfo(String name) {
		System.out.println("社員番号の設定が無かったためデフォルト値を設定します。");
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + DefEmpNumber);
	}
	
	/**
	 * 
	 * @param name　引数は名前
	 * @param EmpNumber　引数は社員番号
	 */
	private void OutPutEmpInfo(String name, String EmpNumber) {
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + EmpNumber);
	}
}
