package sample;

/**
 * 入力された社員名及び社員番号を表示するクラス
 */
public class OutPutEmpInfo {
	
	/**
	 * 社員番号が引数に渡されなかった場合のデフォルト値
	 */
	private static final int DefEmpNumber = 999999999;
	
	/**
	 * <p>
	 * プログラムのメインメソッド
	 * 入力された引数を処理するためにOutPutEmpInfoクラスのインスタンスを作成し、startメソッドを呼び出す。
	 * </p>
	 * @param args プログラム実行時に渡される引数:
	 *             - args[0]: 社員名（必須）
	 *             - args[1]: 社員番号（省略可能）
	 */
	public static void main(String[] args) {
		OutPutEmpInfo empInfo = new OutPutEmpInfo();
		empInfo.start(args);
	}
	
	/**
	 * 引数を受け取り、mainメソッドに渡す。
	 * @param inputs プログラム実行時に渡される引数:
	 * 				- args[0]: 社員名（必須）
	 *              - args[1]: 社員番号（省略可能）
	 */
	private void start(String[] inputs) {
		switch (inputs.length) {
			case 0:
				System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
				return;
			case 1:
				OutPutEmpInfo(inputs[0]);
				return;
			case 2:
				OutPutEmpInfo(inputs[0], inputs[1]);
				return;
			default:
				System.out.println("引数が多く設定されているため、余計な引数を無視します。");
				OutPutEmpInfo(inputs[0], inputs[1]);
				return;
		}
	}
	
	/**
	 * 名前のみ引数に渡された場合の処理、社員番号はデフォルト値とする。
	 * @param name 引数は社員の名前
	 */
	private void OutPutEmpInfo(String name) {
		System.out.println("社員番号の設定が無かったためデフォルト値を設定します。");
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + DefEmpNumber);
	}
	
	/**
	 * 名前と社員番号が渡された場合の処理
	 * @param name 引数は名前
	 * @param EmpNumber 引数は社員番号
	 */
	private void OutPutEmpInfo(String name, String EmpNumber) {
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + EmpNumber);
	}
}
