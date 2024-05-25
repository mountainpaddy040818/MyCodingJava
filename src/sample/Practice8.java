package sample;

public class Practice8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
