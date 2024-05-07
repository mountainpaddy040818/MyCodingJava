package sample;

public class SecondClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		2から始まり2ずつ増加し10までカウント、つまり偶数のみ表示
		for(int i = 2; i <= 50; i+=2)
			if(i < 50) {
				System.out.print(i + ", ");
			} else {
				System.out.print(i);
			}
	}

}
