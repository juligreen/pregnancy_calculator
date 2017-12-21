package de.dehner.pregnancy_calculator.logic;

import de.dehner.pregnancy_calculator.gui.IGUI;

public class Logic {

	private IGUI gui;
	private double numberInput;
	private String unitInput;

	private double numberOutput;
	private double percentage;

	public void decideCalculation(String unitInput) {
		double output = 0;
		switch (unitInput) {

		case "seconds":
			output = Calculation.secondCalculation(numberInput);
			break;
		case "minutes":
			output = Calculation.minuteCalculation(numberInput);
			break;
		case "hours":
			output = Calculation.hourCalculation(numberInput);
			break;
		case "days":
			output = Calculation.dayCalculation(numberInput);
			break;
		case "weeks":
			output = Calculation.weekCalculation(numberInput);
			break;
		case "months":
			output = Calculation.monthCalculation(numberInput);
			break;
		case "years":
			output = Calculation.yearCalculation(numberInput);
			break;
		}
		this.setNumberOutput(output);

	}

	public void setPointNumberToPercentage(double pointNumber) {
		this.setPercentage(Calculation.pointNumberToPercentage(pointNumber));
	}

	public IGUI getGui() {
		return gui;
	}

	public void setGui(IGUI gui) {
		this.gui = gui;
	}

	public double getNumberInput() {
		return numberInput;
	}

	public void setNumberInput(double numberInput) {
		this.numberInput = numberInput;
	}

	public String getUnitInput() {
		return unitInput;
	}

	public void setUnitInput(String unitInput) {
		this.unitInput = unitInput;
	}

	public double getNumberOutput() {
		return numberOutput;
	}

	public void setNumberOutput(double numberOutput) {
		this.numberOutput = numberOutput;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
