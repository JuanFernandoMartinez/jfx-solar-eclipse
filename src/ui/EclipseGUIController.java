package ui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import model.Moon;
import threads.MoonThread;
public class EclipseGUIController {
	
	
	private int dir;
	
	private MoonThread mt;
	
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
    private ImageView imgMoon;
    public EclipseGUIController(){
        moon = new Moon(73, 47);
        mt = new MoonThread(moon, this);
        dir = 0;
    }
   /* @FXML
    void eaff05(ActionEvent event) {
    
    }
	*/
    @FXML
    private Button left;

    /*
    @FXML

    void fffb21(ActionEvent event) {

    }*/

    @FXML
	private Button right;
	
	 
	public void left() {
		dir = 0;
		if (!mt.isAlive()) {
			mt.start();
		}
	}
	
	public void right() {
		dir = 1;
		if (!mt.isAlive()) {
			mt.start();
		}
	}
	
	
	public int getDir() {
		return dir;
	}
	
	public void update() {
		shapeMoon.setLayoutX(moon.getX());
		imgMoon.setLayoutX(moon.getX());
	}
	
  }
