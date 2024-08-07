package sample;

import java.util.Calendar;

/**
 * 月曜日から始まるカレンダーを作成する。
 * 引数より、年、月を取得し、その年月のカレンダーを表示する。
 * ただし、引数が未入力の場合は、システム日付より年、月を取得し、表示する。
 * 入力が合った場合は、以下のチェックを行う。
 */
public class MondayCalendar {
	// 曜日
	private static final String[] WEEK = {"月", "火", "水", "木", "金", "土", "日"};
	// カレンダー
	private Calendar calendar;
	
	/**
	 * 年と月が与えられた場合の処理
	 */
	public MondayCalendar() {
		this.calendar = Calendar.getInstance();
	}
	
	/**
	 * 引数が与えられた場合の処理
	 * 
	 * @param year 年
	 * @param month 月
	 */
	private void fetchCalendar(int year, int month) {
		this.calendar.set(year, month - 1, 1);
	}
	
	/**
	 * 年、月の表示
	 * 曜日出力
	 */
	private void header() {
		int year = this.calendar.get(Calendar.YEAR);
		int month = this.calendar.get(Calendar.MONTH) + 1;
		System.out.printf("　　　　" + "〜　%s年　%s月　〜　%n", year, month);
		System.out.print(" ");
		// カレンダー上部に曜日表示
		for(String week : WEEK) {
			System.out.printf("%3s", week);
		}
		System.out.println();
	}
	
	/**
	 * カレンダーのエントリーポイント
	 * 
	 * @param args 年、月
	 */
	public static void main(String[] args) {
		MondayCalendar calendar = new MondayCalendar();
		// 引数が二つ与えられた場合
		if(args.length == 2) {
			try {
				// 整数型へ変換
				int year = Integer.parseInt(args[0]);
				// 整数型へ変換
				int month = Integer.parseInt(args[1]);
				// 1900以下はエラー
				if(year <= 1900) {
					System.out.println("年は1900以降で入力してください。");
					return;
				}
				// 0以下または13以上はエラー
				if(month < 1 || month > 12) {
					System.out.println("月は1~12の数値を入力してください。");
					return;
				}
				calendar.fetchCalendar(year, month);
			// 半角、全角数字以外はエラー
			} catch(NumberFormatException e) {
				System.out.println("半角または全角数字で入力してください。");
				return;
			}
		// 引数が一つまたは三つ以上の場合はエラー
		} else if(args.length == 1 || args.length >= 3) {
			System.out.println("引数に誤りがあります、確認してください。");
			return;
		}
		calendar.display();
	}
	
	/**
	 * カレンダー表示
	 * 
	 * @param args 年、月
	 */
	private void display() {
		this.calendar.set(Calendar.DATE, 1);
		// カレンダーの余白部分
		int beforeBlank = this.calendar.get(Calendar.DAY_OF_WEEK) - Calendar.MONDAY;
		if(beforeBlank < 0) {
			beforeBlank += 7;
		}
		// ひと月が30日までか、31日までか。
		int daysCount = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		this.header();
		// 余白と日数分をループ処理
		for(int i = 0; i < beforeBlank + daysCount; i++) {
			String string = " ";
			// 空白を空ける
			if(i >= beforeBlank) {
				int date = i + 1 - beforeBlank;
				string = String.valueOf(date);
			}
			System.out.print(String.format("%4s", string));
			// 7日表示したら改行
			if((i + 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}	