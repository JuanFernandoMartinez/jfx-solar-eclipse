package model;

public class Moon{
	
	/**
	 * @param max the max to set
	 */
	public void setMax(double max) {
		this.max = max;
	}

	private double max;
    private double x;
    private double r;
    private boolean moving;
    
    public Moon(double x, double r,double max){
        this.x = x;
        this.r = r;
        this.max=max;
        moving=false;
        System.out.println("X:"+x+", r:"+r+", max:"+max+", moving: "+moving);
    }

    public void advance(double step) {
    	x+=step;
    	if (x >= max) {
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