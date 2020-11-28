package model;

public class Star {
	
   
    private boolean shining;
    
    public Star() {
		
		shining = false;
		
	}
    
    public void toSparkle() {
    	
    	shining = !shining;
    }
    

    public boolean isShining() {
    	
		return shining;
	}
    
}