package model;

public class Moon{
    private double x;
    private double r;
    
    public Moon(double x, double r){
        this.x = x;
        this.r = r;
      
    }

    public void moveRight(){
        x += 10;
    }
    public void moveLeft() {
    	x += 10;
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