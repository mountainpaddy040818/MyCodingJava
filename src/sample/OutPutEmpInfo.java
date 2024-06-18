package sample;

import java.util.Scanner;

//入力された社員名及び社員番号を表示するクラス
public class OutPutEmpInfo {
	private static final int DefEmpNumber = 999999999;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を入力してください。");
		String name = scan.nextLine();
		System.out.println("社員番号を入力してください");
		int EmpNumber = scan.nextInt();
		
		if(args.length == 0) {
			System.out.println("入力値が設定されていません、引数を確認の上再度実行してください。");
		} else if(args.length == 1) {
			OutPutEmpInfo(args[0]);
		} else if (args.length == 2) {
			OutPutEmpInfo(args[0], Integer.parseInt(args[1]));
		} else {
			System.out.println("引数が多く設定されているため、余計な引数を無視します。");
			OutPutEmpInfo(args[0], Integer.parseInt(args[1]));
		}
		scan.close();
	}
	
	public static void OutPutEmpInfo(String name) {
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + DefEmpNumber);
		System.out.println("社員番号の設定が無かったためデフォルト値を設定します。");
	}
	
	public static void OutPutEmpInfo(String name, int EmpNumber) {
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + EmpNumber);
	}
}
