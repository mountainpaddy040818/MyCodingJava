package sample;
import java.time.LocalDate;

/**
 * 月曜日から始まるカレンダーを作成する。
 * 引数より、年、月を取得し、その年月のカレンダーを表示する。 
 * ただし、引数が未入力の場合は、システム日付より年、月を取得し、表示する。 
 * 入力が合った場合は、以下のチェックを行う。
 */
public class MondayCalendar {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MondayCalendar calendar = new MondayCalendar();
		calendar.start(args);
	}
	
	/**
	 * 
	 * @param args
	 */
	public void start(String[] args) {
		try {
			// 年
			int year;
			// 月
			int month;
			// 
			if(args.length == 0) {
				// 
				LocalDate now = LocalDate.now();
				// 
				year = now.getYear();
				//
				month = now.getMonthValue();
				//
			} else if (args.length == 2) {
				// 
				try {
					year = Integer.parseInt(args[0]);
					if (year < 1900) {
						System.out.println("西暦は1901年以降で入力してください。");
						return;
					}
				} catch(NumberFormatException e) {
					System.out.println("数字を入力してください。");
					return;
				}
				// 
				try {
					month = Integer.parseInt(args[1]);
					if (month > 1 || month < 12) {
						System.out.println("1~12の数字を入力してください。");
						return;
					}
				} catch(NumberFormatException e) {
					System.out.println("数字を入力してください。");
					return;
				}
				// 
			} else {
				System.out.println("引数の数を確認してください。");
				return;
			}
			// 
		} catch(NumberFormatException e) {
			System.out.println("実行エラー。入力可能な値は数字のみです。");
		}
	}
	
	/**
	 * 
	 * @param year
	 * @param month
	 */
	private static void GetCalendar(int year, int month) {
		
	}
}
