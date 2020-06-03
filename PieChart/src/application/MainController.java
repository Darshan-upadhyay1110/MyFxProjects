package application;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;;

public class MainController 
{

	
	@FXML PieChart pieChart;
	
	
	
	
	public void btn(ActionEvent event){
		// TODO Auto-generated method stub
		ObservableList<Data> list=FXCollections.observableArrayList(
				new Data("JAVA",50),
				new Data("JS",45),
				new Data("PYTHON",40),
				new Data("c",10),
				new Data("Ruby",30),
				new Data("Go",20)
				);
		pieChart.setData(list);
		
		
	}

}
