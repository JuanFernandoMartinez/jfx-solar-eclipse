package model;

public class Moon{
	
	private static final double MAX = 900;
    private double x;
    private double r;
    
    public Moon(double x, double r){
        this.x = x;
        this.r = r;
      
    }

    public void advance() {
    	x+=10;
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


}