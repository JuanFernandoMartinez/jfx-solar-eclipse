package model;

public class Moon{
    private int x;
    private double r;
    
    public Moon(int x){
        this.x = x;
      
    }

    public void moveRight(){
        x += 10;
    }
    public void moveLeft() {
    	x += 10;
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