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

	private MoonThread mt;

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
		moon = new Moon(shapeMoon.getLayoutX(), shapeMoon.getRadius(),600);
		slider = new Slider(10, 70, 20);		
		System.out.println("aiuda");
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
		//shapeMoon.setLayoutX(moon.getX());
		shapeMoon.setTranslateX(moon.getX());
		imgMoon.setTranslateX(moon.getX());

	}

}
