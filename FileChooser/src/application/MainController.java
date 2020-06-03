package application;

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {
	
	@FXML
	private Button btn1;
	
	@FXML
	private Button btn2;
	
	@FXML
	private ListView listview;
	
	public void Button1(ActionEvent event)
	{
		FileChooser fc=new FileChooser();
		File selectedFile=fc.showOpenDialog(null);
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files","*.pdf"));
		if(selectedFile!=null)
		{
			listview.getItems().add(selectedFile.getAbsolutePath());
		}
		else
		{
			System.out.println("error");
		}
	}
	
	public void Button2(ActionEvent event)
	{
		FileChooser fc=new FileChooser();
		List<File> selectedFile=fc.showOpenMultipleDialog(null);
	
		if(selectedFile!=null)
		{
			for(int i=0;i<selectedFile.size();i++)
			{
				listview.getItems().add(selectedFile.get(i).getAbsolutePath());
			}
		}
		else
		{
			System.out.println("error");
		}
	}
	
	

}
