package de.dehner.pregnancy_calculator.logic;

public class Calculation {
	private double numberInput;
	private String unitInput;

	public static double secondCalculation(double seconds) {
		return Calculation.minuteCalculation(seconds / 60D);
	}

	public static double minuteCalculation(double minutes) {
		return Calculation.hourCalculation(minutes / 60D);
	}

	public static double hourCalculation(double hours) {
		return Calculation.dayCalculation(hours / 24D);
	}

	public static double dayCalculation(double days) {
		return 268 / days;
	}

	public static double yearCalculation(double years) {
		return Calculation.dayCalculation(years * 365D);
	}

	public static double monthCalculation(double months) {
		return Calculation.dayCalculation(months * 30.416D);
	}

	public static double weekCalculation(double weeks) {
		return Calculation.dayCalculation(weeks * 7);
	}
}
