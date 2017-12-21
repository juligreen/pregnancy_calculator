package de.dehner.pregnancy_calculator.logic;

import de.dehner.pregnancy_calculator.gui.IGUI;

public class Logic {

	IGUI gui;
	double numberInput;
	String unitInput;

	public void decideCalculation(String unitInput) {
		switch (unitInput) {
		case "seconds":
			Calculation.secondCalculation(numberInput);
			break;
		case "minutes":
			Calculation.minuteCalculation(numberInput);
			break;
		case "hours":
			Calculation.hourCalculation(numberInput);
			break;
		case "days":
			Calculation.dayCalculation(numberInput);
			break;
		case "weeks":
			Calculation.weekCalculation(numberInput);
			break;
		case "months":
			Calculation.monthCalculation(numberInput);
			break;
		case "years":
			Calculation.yearCalculation(numberInput);
			break;
		}

	}

	public void setGUI(IGUI gui) {
		this.gui = gui;
	}
}
