package sample;

/**
 * 入力された社員名及び社員番号を表示するクラス
 */
public class OutPutEmpInfo {
	
	/**
	 * 社員番号が引数に渡されなかった場合のデフォルト値
	 */
	private static final int DEFAULT_EMPLOYEE_NUMBER = 999999999;
	
	/**
	 * プログラムのメインメソッド
	 * 
	 * インスタンスを作成し、メソッドを呼び出して処理を実行する。
	 * 
	 * @param args プログラム実行時に渡される引数:
	 * 
	 *             - args[0]: 社員名（必須）
	 *             
	 *             - args[1]: 社員番号（省略可能）
	 */
	public static void main(String[] args) {
		OutPutEmpInfo empInfo = new OutPutEmpInfo();
		empInfo.start(args);
	}
	
	/**
	 * 入力された引数の数によって処理が変わるメソッド
	 * 
	 * @param inputs プログラム実行時に渡される引数:
	 * 
	 * 				- inputs[0]: 社員名（必須）
	 * 
	 *              - inputs[1]: 社員番号（省略可能)
	 */
	private void start(String[] inputs) {
		switch (inputs.length) {
			case 0:
				System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
				return;
			case 1:
				outPutEmployeeInfo(inputs[0]);
				return;
			case 2:
				outPutEmployeeInfo(inputs[0], inputs[1]);
				return;
			default:
				System.out.println("引数が多く設定されているため、余計な引数を無視します。");
				outPutEmployeeInfo(inputs[0], inputs[1]);
				return;
		}
	}
	
	/**
	 * 社員名のみ引数に渡された場合の処理、社員番号はデフォルト値とする。
	 * 
	 * @param name 社員名
	 */
	private void outPutEmployeeInfo(String name) {
		System.out.println("社員番号の設定が無かったためデフォルト値を設定します。");
		outPutEmployeeInfo(name, String.valueOf(DEFAULT_EMPLOYEE_NUMBER));
	}
	
	/**
	 * 名前と社員番号が渡された場合の処理
	 * 
	 * @param name 社員名
	 * 
	 * @param EmpNumber 社員番号
	 */
	private void outPutEmployeeInfo(String name, String EmployeeNumber) {
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + EmployeeNumber);
	}
}
