package junit;

public class NextDate {
	private int year;
	private int month;
	private int day;

	//////////////////
	public NextDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public boolean inScope() {
		if (year >= 1912 && year <= 2050 && month >= 1 && month <= 12 && day >= 1 && day <= 31)
			return true;
		return false;
	}

	public boolean isLeapYear() {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		return false;
	}

	public String nextDay() {
		String nextday = null;
		if (!inScope())
			nextday = "输入非法";
		else {
			if (day >= 1 && day <= 27)
				nextday = year + "年" + month + "月" + (day + 1) + "日";
			else if (day == 28) {///////
				if (month != 2)
					nextday = year + "年" + month + "月" + (day + 1) + "日";
				else if (isLeapYear())
					nextday = year + "年" + month + "月" + (day + 1) + "日";
				else
					nextday = year + "年" + (month + 1) + "月" + 1 + "日";
			} ///////
			else if (day == 29) {
				if (month == 2) {
					if (isLeapYear())
						nextday = year + "年" + (month + 1) + "月" + 1 + "日";
					else
						nextday = "非法的日期";
				} else
					nextday = year + "年" + month + "月" + (day + 1) + "日";
			} else if (day == 30) {
				if (month == 2)
					nextday = "非法的日期";
				else if (month == 4 || month == 6 || month == 9 || month == 11) {
					nextday = year + "年" + (month + 1) + "月" + 1 + "日";
				} else
					nextday = year + "年" + month + "月" + (day + 1) + "日";
			} // 30
		} //
		return nextday;
	}
}
