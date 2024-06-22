package sample;

/**
 * 入力された2つの値を比較し大きい方の値を表示するクラス
 */
public class ChkInputNumber {
	// 一つ目に入力される値
	private static int firstNumber = 0;
	// 二つ目に入力される値
	private static int secoundNumber = 0;
	
	/**
	 * 引数が一つしか渡されなかった場合の比較対象となるデフォルト値
	 */
	private static final int DEFAULT_NUMBER = 3;
	
	/**
	 * 引数が一つのみ与えられた場合の処理
	 * 
	 * @param thirdNumber 一つ目の値に代入
	 */
	private static void ChkInputNumber(int thirdNumber) {
		this.firstNumber = thirdNumber;
		this.secoundNumber = DEFAULT_NUMBER;
	}
	
	/**
	 * 引数が二つ与えられた場合の処理
	 * 
	 * @param fourthNumber 一つ目の値に代入
	 * 
	 * @param fifthNumber 二つ目の値に代入
	 */
	private static void ChkInputNumber(int fourthNumber, int fifthNumber) {
		this.firstNumber = fourthNumber;
		this.secoundNumber = fifthNumber;	
	}
	
	/**
	 * 二つの値の内、大きい方の値を処理するメソッド
	 * 
	 * @param args 入力された二つの値
	 */
	private void start(String[] args) {
		switch (args.length) {
			case 0:
				System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
				return;
			case 1:
				System.out.println("入力された引数が一つの為、デフォルト値と比較します。");
				return;
			case 2:
				System.out.println("入力された引数は二つです。");
				return;
			default:
				System.out.println("引数が三つ以上入力された為、三つ目以降の引数をカウントしません。");
				return;
		}
	}
	
	/**
	 * 二つの値を比較して、大きい値を返すメソッド
	 * 
	 * @param firstNumber 一つ目の値
	 * 
	 * @param secoundNumber 二つ目の値
	 * 
	 * @return 値を返す
	 */
	private void checkLargeNumber() {
		if(firstNumber > secoundNumber) {
			System.out.println("大きい値は、" + firstNumber + "です。");
		} else if(firstNumber < secoundNumber){
			System.out.println("大きい値は、" + secoundNumber + "です。");
		} else {
			System.out.println(firstNumber + "と" + secoundNumber + "は等しい値です。");
		}
	}
	
	/**
	 * startメソッドから与えられた引数を渡す。
	 * 
	 * @param args 入力された二つの値
	 */
	public static void main(String[] args) {
		ChkInputNumber inputNumber = new ChkInputNumber();
		inputNumber.start(args);
		try {
			if(args.length == 1) {
				int firstCase = Integer.parseInt(args[0]);
				ChkInputNumber compare = new ChkInputNumber(firstCase);
				compare.checkLargeNumber();
			} else if(args.length == 2) {
				int firstCase = Integer.parseInt(args[0]);
				int secoundCase = Integer.parseInt(args[1]);
				ChkInputNumber compare = new ChkInputNumber(firstCase, secoundCase);
				compare.checkLargeNumber();
			}
		} catch(NumberFormatException e) {
			System.out.println("引数が数字ではありません。");
		}
	}
}
