package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MAinController implements Initializable {

	@FXML
	private Slider slider;
	@FXML
	private TextField textFi;
	
	private static final double INIT_VALUE=50;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	slider.setValue(INIT_VALUE);
	textFi.setText(new Double(INIT_VALUE).toString());
	textFi.textProperty().bindBidirectional(slider.valueProperty(),NumberFormat.getInstance());
	}

}
