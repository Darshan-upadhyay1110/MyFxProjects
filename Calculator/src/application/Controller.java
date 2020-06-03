package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;

public class Controller {
	
	@FXML
	private Label lb;
	private long number1=0;
	private String ope="";
	private boolean start=true;
	Modal modal=new Modal();
	
	
	public void processNum(ActionEvent event)
	{
		if(start) {
			lb.setText("");
			start=false;
		}
		 Button button = (Button) event.getSource();
		 String value=button.getText();
		 lb.setText(lb.getText()+value);
	}
	public void processOprt(ActionEvent event)
	{
		 Button button = (Button) event.getSource();
		 String value=button.getText();
		 if(!value.equals("=")) {
			 if(!ope.isEmpty())
			 {
				 return;
			 }
			 ope=value;
			number1=Long.parseLong(lb.getText());
			lb.setText("");
		 }
		 else {
			 if(ope.isEmpty())
			 {
				 return;
			 }
			 long number2=Long.parseLong(lb.getText());
			 float op=modal.getValue(number1, number2, ope);
			lb.setText(String.valueOf(op));
			ope="";
			start=true;
		 }
		
	}

}
