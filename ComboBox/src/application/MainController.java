package application;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable {

	@FXML
	private ComboBox<String> combobox;
	@FXML
	private Label label; 
	@FXML
	public ListView<String> listview;
	
	ObservableList<String> list=FXCollections.observableArrayList("1","2","3","4","5","6","7","8");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		combobox.setItems(list);
		listview.setItems(list);
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
	}
	public void text(ActionEvent event)
	{
		label.setText(combobox.getValue());
		ObservableList<String> name;
		name=listview.getSelectionModel().getSelectedItems();
		for(String names:name)
		{
			System.out.println(names);
		}
		
	}

}
