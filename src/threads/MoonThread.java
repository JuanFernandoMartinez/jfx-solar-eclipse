package threads;

import javafx.application.Platform;
import model.Moon;
import ui.EclipseGUIController;

public class MoonThread extends Thread {
	private Moon moon;
	private EclipseGUIController app;
	
	
	public MoonThread(Moon m, EclipseGUIController e) {
		moon = m;
		app = e;
	}
	
	@Override
	public void run() {
		int i = 100;
		while (i>0) {
			Platform.runLater(new Thread() {
				public void run() {
					if (app.getDir() == 0) {
						moon.moveLeft();
					}else {
						moon.moveRight();
					}
					
					app.update();
				}
			});
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
