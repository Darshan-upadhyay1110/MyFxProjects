package application;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
public class HelloWorld extends Application {
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene=new Scene(root);
		primaryStage.setTitle("MyProject");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
