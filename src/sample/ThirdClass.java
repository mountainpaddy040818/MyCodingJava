package sample;

public class ThirdClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		偶数の数
		int count = 0;
//		偶数の和、合計値
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.println(count);
		System.out.println(sum);
	}

}
