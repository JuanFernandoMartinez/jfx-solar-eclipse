package threads;

import model.Star;
import ui.EclipseGUIController;

public class StarThread extends Thread{
	private EclipseGUIController eclipGUI;
	private Star star;
	
	public StarThread(EclipseGUIController eGUI, Star s) {
		setDaemon(true);
		eGUI= eclipGUI;
		this.star = s;
	}

	public void run() {
	

	}

}