package fenetres;


import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private Label lbl_infoconnexion;
	
	@FXML
	private JFXTextField tfd_logid;
	
	@FXML
	private JFXPasswordField pwd_passe;
	
	
	private BorderPane rootLayout;
	
	Stage primaryStage = new Stage();
	public void login() throws Exception {
		
		if (tfd_logid.getText().equals("marius") && pwd_passe.getText().equals("elvis")) {
			Parent root = FXMLLoader.load(getClass().getResource("/fenetres/RootLayout.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else {
			lbl_infoconnexion.setText("Connexion echoue");
		}
	}
	
	
	public void contenu() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/fenetres/FenConnexion.fxml"));
			AnchorPane tabClient = (AnchorPane) loader.load();
			
			rootLayout.setCenter(tabClient);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	


}
