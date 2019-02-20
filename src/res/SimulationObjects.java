package res;

import java.awt.Dimension;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public abstract class SimulationObjects extends CanvasHandler {
	

	
	private double LocationX, LocationY;
	private String layingType;
	
	protected SimulationObjects(Canvas canvas,GraphicsContext gc) {
		super(canvas,gc);
		
	}

	
	public double getLocationY() {
		return LocationY;
	}

	public void setLocationY(double locationy) {
		LocationY = locationy;
	}

	public double getLocationX() {
		return LocationX;
	}

	public void setLocationX(double locationx) {
		LocationX = locationx;
	}
	
	public void setLocation(double locationx,double locationy) {
		LocationX = locationx;
		LocationY = locationy;
	}
	
	public Dimension getLocation() {
		Dimension location=new Dimension();
		location.setSize(LocationX, LocationY);
		
		return location;
	}


	public String getLayingType() {
		return layingType;
	}


	public void setLayingType(String layingType) {
		this.layingType = layingType;
	}
	
	protected void staticHandler(SimulationObjects block) {
		this.setLayingType(ObjectProperty.STATIC);
		staticObjectCounter++;
		
	}
	
	
	
	
}
