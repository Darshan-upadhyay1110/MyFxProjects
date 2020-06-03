package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {
	@FXML private WebView webView;
	@FXML private WebEngine engine;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		engine=webView.getEngine();
		
	}
	public void btn1(ActionEvent event)
	{
		engine.load("https://www.google.com");
		
	}
	public void btn2(ActionEvent event)
	{
		engine.loadContent("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
				"    <title>Harry Fitness</title>\r\n" + 
				"</head>\r\n" + 
				"<link href=\"https://fonts.googleapis.com/css?family=Baloo+Bhai&display=swap\" rel=\"stylesheet\">\r\n" + 
				"<link rel=\"stylesheet\" href=\"css/style.css\">\r\n" + 
				"<style>\r\n" + 
				"    /* CSS Reset */\r\n" + 
				"    body {\r\n" + 
				"        font-family: 'Baloo Bhai', cursive;\r\n" + 
				"        color: white;\r\n" + 
				"        margin: 0px;\r\n" + 
				"        padding: 0px;\r\n" + 
				"        background: url('img/bg.jpg');\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .left {\r\n" + 
				"        display: inline-block;\r\n" + 
				"        /* border: 2px solid red; */\r\n" + 
				"        position: absolute;\r\n" + 
				"        left: 60px;\r\n" + 
				"        top: 20px;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .left img {\r\n" + 
				"        width: 136px;\r\n" + 
				"        filter: invert(100%);\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .left div {\r\n" + 
				"        line-height: 19px;\r\n" + 
				"        font-size: 26px;\r\n" + 
				"        text-align: center;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .mid {\r\n" + 
				"        display: block;\r\n" + 
				"        width: 36%;\r\n" + 
				"        margin: 29px auto;\r\n" + 
				"        /* border: 2px solid green; */\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .right {\r\n" + 
				"        position: absolute;\r\n" + 
				"        right: 34px;\r\n" + 
				"        top: 43px;\r\n" + 
				"        display: inline-block;\r\n" + 
				"        /* border: 2px solid yellow; */\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .navbar {\r\n" + 
				"        display: inline-block;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .navbar li {\r\n" + 
				"        display: inline-block;\r\n" + 
				"        font-size: 25px;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .navbar li a {\r\n" + 
				"        color: white;\r\n" + 
				"        text-decoration: none;\r\n" + 
				"        padding: 34px 23px;\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .navbar li a:hover,\r\n" + 
				"    .navbar li a.active {\r\n" + 
				"        text-decoration: underline;\r\n" + 
				"        color: grey;\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .btn {\r\n" + 
				"        font-family: 'Baloo Bhai', cursive;\r\n" + 
				"        margin: 0px 9px;\r\n" + 
				"        background-color: black;\r\n" + 
				"        color: white;\r\n" + 
				"        padding: 4px 14px;\r\n" + 
				"        border: 2px solid grey;\r\n" + 
				"        border-radius: 10px;\r\n" + 
				"        font-size: 20px;\r\n" + 
				"        cursor: pointer;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .btn:hover {\r\n" + 
				"        background-color: rgb(31, 30, 30);\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .container {\r\n" + 
				"        border: 2px solid white;\r\n" + 
				"        margin: 106px 80px;\r\n" + 
				"        padding: 75px;\r\n" + 
				"        width: 33%;\r\n" + 
				"        border-radius: 28px;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .form-group input {\r\n" + 
				"        font-family: 'Baloo Bhai', cursive;\r\n" + 
				"        text-align: center;\r\n" + 
				"        display: block;\r\n" + 
				"        width: 508px;\r\n" + 
				"        padding: 1px;\r\n" + 
				"        border: 2px solid black;\r\n" + 
				"        margin: 11px auto;\r\n" + 
				"        font-size: 25px;\r\n" + 
				"        border-radius: 8px;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .container h1 {\r\n" + 
				"        text-align: center;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    .container button {\r\n" + 
				"        display: block;\r\n" + 
				"        width: 74%;\r\n" + 
				"        margin: 20px auto;\r\n" + 
				"    }\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"    <header class=\"header\">\r\n" + 
				"        <!-- Left box for logo -->\r\n" + 
				"        <div class=\"left\">\r\n" + 
				"            <img src=\"img/gym.png\" alt=\"\">\r\n" + 
				"            <div>Harry Fitness</div>\r\n" + 
				"        </div>\r\n" + 
				"        <!-- Mid box for navbar -->\r\n" + 
				"        <div class=\"mid\">\r\n" + 
				"            <ul class=\"navbar\">\r\n" + 
				"                <li><a href=\"#\" class=\"active\">Home</a></li>\r\n" + 
				"                <li><a href=\"#\">About Us</a></li>\r\n" + 
				"                <li><a href=\"#\">Fitness Calculator</a></li>\r\n" + 
				"                <li><a href=\"#\">Contact Us</a></li>\r\n" + 
				"            </ul>\r\n" + 
				"        </div>\r\n" + 
				"\r\n" + 
				"        <!-- Right box for buttons -->\r\n" + 
				"        <div class=\"right\">\r\n" + 
				"            <button class=\"btn\">Call Us Now</button>\r\n" + 
				"            <button class=\"btn\">Email Us</button>\r\n" + 
				"        </div>\r\n" + 
				"    </header>\r\n" + 
				"    <div class=\"container\">\r\n" + 
				"        <h1>Join the best gym of Delhi now</h1>\r\n" + 
				"        <form action=\"noaction.php\">\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <input type=\"text\" name=\"\" placeholder=\"Enter your Name\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <input type=\"text\" name=\"\" placeholder=\"Enter your Age\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <input type=\"text\" name=\"\" placeholder=\"Enter your Gender\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <input type=\"text\" name=\"\" placeholder=\"Enter your Locality\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <input type=\"text\" name=\"\" placeholder=\"Enter your Email Id\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <input type=\"text\" name=\"\" placeholder=\"Enter your Phone Number\">\r\n" + 
				"            </div>\r\n" + 
				"            <button class=\"btn\">Submit</button>\r\n" + 
				"        </form>\r\n" + 
				"    </div>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
		
	}
public void btn3(ActionEvent event)
{
	engine.reload();
}

}
