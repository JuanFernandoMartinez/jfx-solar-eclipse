package model;

public class Moon{
	
	private static final double MAX = 900;
    private double x;
    private double r;
    private boolean moving;
    
    public Moon(double x, double r){
        this.x = x;
        this.r = r;
        moving=false;
    }

    public void advance(double step) {
    	x+=step;
    	if (x >= MAX) {
    		x = -2*r;
    	}
    }

    public double getX(){
        return x;
    }

    public void setX(int x ){
        this.x = x;
    }

	public double getR() {
		return r;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}


}