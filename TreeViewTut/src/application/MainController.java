package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {
	@FXML
    private TreeView<String> TV;
	
	Image icon=new Image(getClass().getResourceAsStream("/img/icon.png"));
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		 TreeItem<String> root=new TreeItem<>("ROOT",new ImageView(icon));
		 root.setExpanded(true);
		 
		 TreeItem<String> node1=new TreeItem<>("node1",new ImageView(icon));
		 TreeItem<String> node2=new TreeItem<>("node2",new ImageView(icon));
		 TreeItem<String> node3=new TreeItem<>("node3",new ImageView(icon));
		 
		 root.getChildren().add(node1);
		 root.getChildren().addAll(node2,node3);
		 
		 TreeItem<String> nodea=new TreeItem<>("nodea");
		 TreeItem<String> nodeb=new TreeItem<>("nodeb");
		 TreeItem<String> nodec=new TreeItem<>("nodec");
		 
		 node1.getChildren().addAll(nodea,nodeb,nodec);
		 
		 TV.setRoot(root);
		
	}
	public void mouseClik(MouseEvent me)
	{
		if(me.getClickCount()==2)
		{
			System.out.println(TV.getSelectionModel().getSelectedItem().getValue());
		}
	}

}
