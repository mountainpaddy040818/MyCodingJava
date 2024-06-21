package sample;

//入力された社員名及び社員番号を表示するクラス
public class OutPutEmpInfo {
	
	/**
	 * 社員番号を入力されなかった場合のデフォルト値
	 */
	private static final int DefEmpNumber = 999999999;
	
	/**
	 * 
	 * @param args 実行時の引数。引数は不要。すべての入力は実行時にコンソールから行われる。
	 */
	public static void main(String[] args) {
		OutPutEmpInfo empInfo = new OutPutEmpInfo();
		empInfo.start();
	}
	
	private void start() {
		
	}
	
	/**
	 * 
	 * @param name 引数は社員の名前
	 */
	private void OutPutEmpInfo(String name) {
		System.out.println("社員番号の設定が無かったためデフォルト値を設定します。");
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + DefEmpNumber);
	}
	
	/**
	 * 
	 * @param name 引数は名前
	 * @param EmpNumber 引数は社員番号
	 */
	private void OutPutEmpInfo(String name, String EmpNumber) {
		System.out.println("名前　　：" + name);
		System.out.println("社員番号：" + EmpNumber);
	}
}
