package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import model.Moon;
public class EclipseGUIController {
	
    private Moon moon;

    @FXML
    private Circle shapeMoon;

    @FXML
    private Circle shapeSun;

    @FXML
    private Circle star4;

    @FXML
    private Circle star5;

    @FXML
    private Circle star2;

    @FXML
    private Circle star3;

    @FXML
    private Circle planet5;

    @FXML
    private Circle planet4;

    @FXML
    private Circle planet3;

    @FXML
    private Circle star1;

    @FXML
    private Circle planet2;

    @FXML
    private Circle planet1;



    @FXML
    private Button left;

    @FXML
    private Button right;
    @FXML 
    void left(ActionEvent event) {
    	Moon nm = new Moon(moon.getX());
    	nm.moveLeft();
    	moon.setX(moon.getX() - 10);    	
    }

    }
