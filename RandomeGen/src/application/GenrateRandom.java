package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GenrateRandom {
	@FXML
	private Label lb;
	public void randome(ActionEvent event)
	{
		Random rand=new Random();
		int p=rand.nextInt(100)+1;
		lb.setText(Integer.toString(p));
		
		
	}

}
