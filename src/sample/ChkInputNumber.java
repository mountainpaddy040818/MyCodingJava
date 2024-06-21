package sample;

/**
 * 入力された2つの値を比較し大きい方の値を表示するクラス
 */
public class ChkInputNumber {
	
	/**
	 * 引数が一つしか渡されなかった場合の比較対象となるデフォルト値
	 * このように定義することで、デフォルト値にアクセス制限が掛かり、
	 * 他のクラスから直接参照や更新が出来なくなります。
	 */
	private static final int DefNumber = 3;
	
	/**
	 * startメソッドから与えられた引数を渡す。
	 * @param args 引数は入力された二つの値
	 */
	public static void main(String[] args) {
		ChkInputNumber inputNumber = new ChkInputNumber();
		inputNumber.start(args);
	}
	
	/**
	 * 二つの値の内、大きい方の値を処理するメソッド
	 * @param args 引数は二つの入力される値
	 */
	public void start(String[] args) {
		try {
			switch (args.length) {
				case 0:
					System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
					return;
				case 1:
					System.out.println("入力された引数が一つの為、デフォルト値と比較します。");
					int FirstCase = Integer.parseInt(args[0]);
					int GetLargeNumber_case1 = CheckLargeNumber(FirstCase, DefNumber);
					System.out.println("大きい値は、" + GetLargeNumber_case1 + "です。");
					return;
				case 2:
					System.out.println("入力された引数：2");
					int SecoundCase = Integer.parseInt(args[0]);
					int ThirdCase = Integer.parseInt(args[1]);
					int GetLargeNumber_case2 = CheckLargeNumber(SecoundCase, ThirdCase);
					System.out.println("大きい値は、" + GetLargeNumber_case2 + "です。");
					return;
				default:
					System.out.println("引数が3つ以上入力された為、3つ目以降の引数をカウントしません。");
					int FourthCase = Integer.parseInt(args[0]);
					int FifthCase = Integer.parseInt(args[1]);
					int GetLargeNumber_case3 = CheckLargeNumber(FourthCase, FifthCase);
					System.out.println("大きい値は、" + GetLargeNumber_case3 + "です。");
					return;
			}
		} catch (NumberFormatException e) {
			System.out.println("実行エラーです。記号、文字以外の「数値」を入力してください。");
		}	
	}
	
	/**
	 * 二つの値を比較して、大きい値を返すメソッド
	 * @param a 一つ目の引数
	 * @param b 二つ目の引数
	 * @return 値を返す
	 */
	private int CheckLargeNumber (int a, int b) {
		return a > b ? a : b;
	}
}
