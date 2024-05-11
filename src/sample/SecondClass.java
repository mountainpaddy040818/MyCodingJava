package sample;

public class SecondClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		iは2から始まり2ずつ増加し10までカウント、各数値を","区切りで表示
		for(int i = 2; i <= 10; i+=2)
			if(i < 10) {
				System.out.print(i + ", ");
			} else {
				System.out.print(i);
			}
	}

}
