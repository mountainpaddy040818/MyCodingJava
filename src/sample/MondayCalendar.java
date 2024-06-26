package sample;
import java.time.LocalDate;
import java.time.YearMonth;

/**
 * 月曜日から始まるカレンダーを作成する。
 * 
 * 引数より、年、月を取得し、その年月のカレンダーを表示する。
 *  
 * ただし、引数が未入力の場合は、システム日付より年、月を取得し、表示する。
 *  
 * 入力が合った場合は、以下のチェックを行う。
 */
public class MondayCalendar {
	// 年
	private int year = 0;
	// 月
	private int month = 0;
	
	/**
	 * デフォルト
	 */
	public MondayCalendar() {
		
	}
	
	/**
	 * 年と月が与えられた場合の処理
	 * 
	 * @param year 年
	 * @param month 月
	 */
	public void MondayCalendar(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	/**
	 * メインメソッド
	 * 
	 * @param args 西暦と月
	 */
	public static void main(String[] args) {
		MondayCalendar calendar = new MondayCalendar();
		calendar.display(args);
	}
	
	/**
	 * 引数の数に応じてメッセージ出力
	 * 
	 * @param args 西暦と月
	 */
	private void display(String[] args) {
		try {
			// 
			if(args.length == 0) {
				// 
				LocalDate now = LocalDate.now();
				year = now.getYear();
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
					if (month < 1 || month > 12) {
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
	 * カレンダー表示
	 * 
	 * @param year 年
	 * @param month 月
	 */
	public void calendar(int year, int month) {
		YearMonth yearMonth = YearMonth.of(year, month);
		LocalDate firstDayOfMonth = yearMonth.atDay(1);
		
		System.out.printf("~ %d年 %d月 ~%n", year, month);
		System.out.println("月 火 水 木 金 土 日");
		// 毎月1日
		int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();
		// 
		int adjustment = (firstDayOfWeek == 7) ? 0 : firstDayOfWeek;
		
		for(int i = 0; i < adjustment; i++) {
			System.out.print("　　");
		}
		
		for(int day = 1; day <= yearMonth.lengthOfMonth(); day++) {
			System.out.printf("%2d", day);
			if((day + adjustment - 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
