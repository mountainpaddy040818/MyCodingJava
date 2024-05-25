package sample;

public class Practice8 {

	public static void main(String[] args) {
//		変数iは1~1000まで出力される
		for (int i = 1; i <= 1000; i++) {
//		3と5で割り切れる数値の場合は"FizzBuzz"と出力	
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
//		3のみで割り切れる場合は"Fizz"と出力		
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
//		5のみで割り切れる場合は"Buzz"と出力		
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
//		それ以外の数値はそのまま出力		
			} else {
				System.out.println(i);
			}
		}
	}

}
