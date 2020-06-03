package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Control_Login {
	@FXML
	private TextField user;
	@FXML
	private TextField password;
	@FXML
	private Label status;
	
	public void verify(ActionEvent event) throws IOException
	{
		if(user.getText().equals("darshan") && password.getText().equals("1110"))
		{
			status.setText("Loged In Successfully");
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("NewWindow.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else
		{
			status.setText("fail to log in");
		}
	}
	public void back(ActionEvent event)
	{
		try {
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
