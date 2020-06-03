package application;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainController implements Initializable {

	
  final MyNumber myNum=new MyNumber();
  @FXML
  private Label label;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		myNum.setNumber(0);
		myNum.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				
				label.setText(new Double(myNum.getNumber()).toString());
			}
			
		});
	}
	public void btn1(ActionEvent event)
	{
			myNum.setNumber(myNum.getNumber()+1);
	}

}
