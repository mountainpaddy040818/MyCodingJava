package sample;

/**
 * 入力された2つの値を比較し大きい方の値を表示する
 */
public class ChkInputNumber {
	
	/**
	 * 引数が一つしか渡されなかった場合の比較対象となるデフォルト値
	 */
	private static final int DEFAULT_NUMBER = 3;
	// 一つ目に入力される値
	private int firstNumber = 0;
	// 二つ目に入力される値
	private int secoundNumber = 0;
	
	/**
	 * デフォルト
	 */
	public ChkInputNumber() {
		
	}
	
	/**
	 * 引数が一つのみ与えられた場合の処理
	 * 
	 * @param firstNumber
	 */
	public ChkInputNumber(int firstNumber) {
		this.firstNumber = firstNumber;
		this.secoundNumber = DEFAULT_NUMBER;
	}
	
	/**
	 * 引数が二つ与えられた場合の処理
	 * 
	 * @param firstNumber 一つ目の値に代入
	 * @param secoundNumber 二つ目の値に代入
	 */
	public ChkInputNumber(int firstNumber, int secoundNumber) {
		this.firstNumber = firstNumber;
		this.secoundNumber = secoundNumber;	
	}
	
	/**
	 * 入力された2つの値を比較し大きい方の値を表示する
	 * 
	 * @param args 入力された二つの値
	 */
	public static void main(String[] args) {	
		// 引数がない場合「偽」、引数が一つ以上ある場合「真」
		if(!checkArgs(args)) {
			return;
		}
		ChkInputNumber compare;
		// 引数の数に応じて出力変化
		try {
			if(args.length == 1) {
				int firstCase = Integer.parseInt(args[0]);
				compare = new ChkInputNumber(firstCase);
			} else {
				int firstCase = Integer.parseInt(args[0]);
				int secoundCase = Integer.parseInt(args[1]);
				compare = new ChkInputNumber(firstCase, secoundCase);
			}
			compare.checkLargeNumber();
		} catch (NumberFormatException e) {
			System.out.println("半角または全角数字のみで入力してください。");
		}
	}

	/**
	 * 引数の数に応じてメッセージ出力
	 * 
	 * @param args 入力された二つの値
	 */
	private static boolean checkArgs(String[] args) {
		// 引数の数に応じてメッセージの呼び出し、真偽チェック。
		switch (args.length) {
			case 0:
				System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
				return false;
			case 1:
				System.out.println("入力された引数が一つの為、デフォルト値と比較します。");
				return true;
			case 2:
				System.out.println("入力された引数は二つです。");
				return true;
			default:
				System.out.println("引数が三つ以上入力された為、三つ目以降の引数をカウントしません。");
				return true;
		}
	}
	
	/**
	 * 二つの値を比較して、大きい値を返す。
	 */
	private void checkLargeNumber() {
		if(this.firstNumber > this.secoundNumber) {
			System.out.println("大きい値は" + this.firstNumber + "です。");
		} else if(this.firstNumber < this.secoundNumber){
			System.out.println("大きい値は" + this.secoundNumber + "です。");
		} else {
			System.out.println(this.firstNumber + "と" + this.secoundNumber + "は等しい値です。");
		}
	}
}
