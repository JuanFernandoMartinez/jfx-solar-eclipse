package model;

public class Moon{
    private int x;
    private double r;
    
    public Moon(int x, double r){
        this.x = x;
        this.r = r;
    }

    public void advance(){
        x = x+10;
    }

    public int getX(){
        return x;
    }

    public void setX(int x ){
        this.x = x;
    }

	public double getR() {
		return r;
	}


}