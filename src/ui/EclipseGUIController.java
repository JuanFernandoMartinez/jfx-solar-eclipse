package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
//import javafx.scene.transform.Translate;
import model.Moon;
import threads.MoonThread;

public class EclipseGUIController {

	private final static int[] ILLUMINATED = new int[] { 255, 249, 139 };

	private MoonThread mt;

	private Circle[] stars;
	private Circle[] planets;
	
	private Moon moon;

	@FXML
	private AnchorPane mainPane;

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

	@FXML
	private Button stop;

	@FXML
	private Button start;

	@FXML
	private Slider slider;

	public void initialize() {
		moon = new Moon(shapeMoon.getLayoutX(), shapeMoon.getRadius(), 600);
		stars= new Circle[5];
		stars[0]=star1;
		stars[1]=star2;
		stars[2]=star3;
		stars[3]=star4;
		stars[4]=star5;
		planets= new Circle[5];
		planets[0]=planet1;
		planets[1]=planet2;
		planets[2]=planet3;
		planets[3]=planet4;
		planets[4]=planet5;
	}

	public EclipseGUIController() {

	}

	@FXML
	public void startBtn(ActionEvent event) {
		start.setDisable(true);
		stop.setDisable(false);
		moon.setMoving(true);
		mt = new MoonThread(moon, this);
		mt.setDaemon(true);
		mt.start();
	}

	@FXML
	public void stopBtn(ActionEvent event) {
		stop.setDisable(true);
		start.setDisable(false);
		moon.setMoving(false);
	}

	public double getSliderValue() {
		return slider.getValue();
	}

	public void update() {
		shapeMoon.setTranslateX(moon.getX());
		imgMoon.setTranslateX(moon.getX());
		double diff = Math.abs(shapeSun.getLayoutX() - moon.getX()-moon.getR());
		double diameter = moon.getR() * 2;
		if (diff <= diameter) {
			for (int i = 0; i < planets.length; i++) {
				planets[i].setVisible(true);
				if(stars[i].isVisible()) {
					stars[i].setVisible(false);
				}
				else {
					stars[i].setVisible(true);
				}
			}
			
			double pos = diff / diameter;
			int r = (int) (ILLUMINATED[0] * pos);
			int g = (int) (ILLUMINATED[1] * pos);
			int b = (int) (ILLUMINATED[2] * pos);
			mainPane.setStyle("-fx-background-color:rgb("+r+","+g+","+b+");");
		}
		else {
			for (int i = 0; i < stars.length; i++) {
				planets[i].setVisible(false);
				stars[i].setVisible(false);
			}
		}
	}
}
