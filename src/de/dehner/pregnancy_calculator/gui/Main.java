package de.dehner.pregnancy_calculator.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application implements IGUI {

	private Stage primaryStage;
	private AnchorPane rootLayout;

	@Override
	public void start(Stage primaryStage) {

		/*
		 * ( // only allow numbers numberInput.textProperty().addListener(new
		 * ChangeListener<String>() {
		 * 
		 * @Override public void changed(ObservableValue<? extends String>
		 * observable, String oldValue, String newValue) { if
		 * (!newValue.matches("\\d*")) {
		 * numberInput.setText(newValue.replaceAll("[^\\d]", "")); } } });
		 */

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Pregnancy Calculator");

		initRootLayout();

	}

	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Main.fxml"));
			rootLayout = (AnchorPane) loader.load();
			MainController controller = loader.getController();
			controller.setMainApp(this);

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
