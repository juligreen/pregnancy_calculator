package de.dehner.pregnancy_calculator.gui;

import java.text.DecimalFormat;

import de.dehner.pregnancy_calculator.logic.Logic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	private String[] units = { "seconds", "minutes", "hours", "days", "weeks", "months", "years" };

	@FXML
	private TextField numberInputField;

	@FXML
	private ComboBox<String> unitInputComboBox;

	@FXML
	private Label pointNumberLabel;

	@FXML
	private Label percentageLabel;

	@FXML
	private Button calculationButton;

	private Main mainApp;

	public MainController() {

	}

	@FXML
	private void calculateOnButtonClick() {
		Logic logic = new Logic();
		double pointNumber = logic.decideCalculation(unitInputComboBox.getValue(),
				Double.parseDouble((numberInputField.getText())));
		double percentage = logic.getPointNumberToPercentage(pointNumber);
		DecimalFormat numberFormat = new DecimalFormat("0.0000");

		String numberString = Double.toString(pointNumber);
		String percentageString = numberFormat.format(percentage) + "%";

		// pointNumberLabel.setText(numberString);
		percentageLabel.setText(percentageString);
	}

	@FXML
	private void initialize() {
		unitInputComboBox.getItems().addAll(units);
		unitInputComboBox.getSelectionModel().select("days");
	}

	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;

	}

}
