package sample;

public class ThirdClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.println("偶数の個数は" + count );
		System.out.println("偶数の合計は" + sum );
	}

}
