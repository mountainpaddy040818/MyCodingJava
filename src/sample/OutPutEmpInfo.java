package sample;

/**
 * 入力された社員名及び社員番号を表示する
 */
public class OutPutEmpInfo {
	
	/**
	 * 社員番号が引数に渡されなかった場合のデフォルト値
	 */
	private static final int DEFAULT_EMPLOYEE_NUMBER = 999999999;
	
	/**
	 * プログラムのエントリーポイント
	 * 
	 * @param args プログラム実行時に渡される引数:
	 *             - args[0]: 社員名（必須）
	 *             - args[1]: 社員番号（省略可能）
	 */
	public static void main(String[] args) {
		OutPutEmpInfo empInfo = new OutPutEmpInfo();
		empInfo.display(args);
	}
	
	/**
	 * 入力された社員名及び社員番号を表示する
	 * 
	 * @param inputs プログラム実行時に渡される引数:
	 * 				- inputs[0]: 社員名（必須）
	 *              - inputs[1]: 社員番号（省略可能)
	 */
	public void display(String[] inputs) {
		// 引数が入力されない場合
		if(inputs == null) {
			System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
			return;
		}
		// 引数の数に応じてメッセージ出力
		switch (inputs.length) {
			case 0:
				System.out.println("入力値が設定されていません。引数を確認の上再度実行してください。");
				return;
			case 1:
				outputEmployeeInfo(inputs[0]);
				return;
			case 2:
				outputEmployeeInfo(inputs[0], inputs[1]);
				return;
			default:
				System.out.println("引数が多く設定されているため、余計な引数を無視します。");
				outputEmployeeInfo(inputs[0], inputs[1]);
				return;
		}
	}
	
	/**
	 * 社員名及び社員番号の表示
	 * 
	 * @param name 社員名
	 */
	private void outputEmployeeInfo(String name) {
		System.out.println("社員番号の設定が無かったためデフォルト値を設定します。");
		outputEmployeeInfo(name, String.valueOf(DEFAULT_EMPLOYEE_NUMBER));
	}
	
	/**
	 * 社員名及び社員番号の表示
	 * 
	 * @param name 社員名
	 * @param employeeNumber 社員番号
	 */
	private void outputEmployeeInfo(String name, String employeeNumber) {
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + employeeNumber);
	}
}
