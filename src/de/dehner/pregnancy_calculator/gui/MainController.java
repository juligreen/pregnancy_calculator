package de.dehner.pregnancy_calculator.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

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

	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;

	}

}
