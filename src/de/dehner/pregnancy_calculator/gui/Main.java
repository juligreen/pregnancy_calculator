package de.dehner.pregnancy_calculator.gui;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements IGUI {
	@Override
	public void start(Stage primaryStage) {
		TextField numberInput;
		Label instruction;

		FlowPane root = new FlowPane(Orientation.VERTICAL);
		Scene scene = new Scene(root, 1080, 1920);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		numberInput = new TextField();
		numberInput.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d*")) {
					numberInput.setText(newValue.replaceAll("[^\\d]", ""));
				}
			}
		});

		instruction = new Label("Geben Sie bitte die zu berechnende Dauer ein:");

		root.getChildren().add(instruction);
		root.getChildren().add(numberInput);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public double getNumberInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUnitInput() {
		// TODO Auto-generated method stub
		return null;
	}
}
