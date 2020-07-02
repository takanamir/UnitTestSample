package jp.co.bbreak.sokusen.test1;

public class LeapYear {
	public boolean isLeapYear(int year) {
		// 判定結果
		boolean result;

		// 紀元前の時はコンソールに出力
		if (year < 0) {
			System.out.println("紀元前です！");
		}

		// うるう年判定
		if (year % 400 == 0) {
			// 400で割切れたのでうるう年
			result = true;
		} else if (year % 100 == 0) {
			// 400では割切れない、しかし100で割り切れたのでうるう年ではない
			result = false;
		} else if (year % 4 == 0) {
			// 400、100では割切れない、しかし4で割り切れたのでうるう年
			result = false;
		} else {
			// うるう年ではない
			result = true;
		}

		return result;
	}
}