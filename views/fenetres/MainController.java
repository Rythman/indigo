package fenetres;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private Label lbl_infoconnexion;
	
	@FXML
	private TextField tfd_logid;
	
	@FXML
	private TextField pwd_passe;
	
	public void login() throws Exception {
		Stage primaryStage = new Stage();
		if (tfd_logid.getText().equals("marius") && pwd_passe.getText().equals("elvis")) {
			Parent root = FXMLLoader.load(getClass().getResource("/fenetres/FenPrincipale1.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else {
			lbl_infoconnexion.setText("Connexion echoue");
		}
	}
	

}
