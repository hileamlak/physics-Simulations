package res.objects;

import java.awt.Dimension;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import res.ObjectProperty;
import res.SimulationObjects;

public class Line extends SimulationObjects {
	
	private GraphicsContext gc;
	private Canvas canvas;
	private double length,angleFH;
	private static int idCounter=0;
	private String id;
	Color color; 
	
	public Line(Canvas canvas,GraphicsContext gc,Color color,String type,double length,double angleFH) {
		super(canvas,gc);
		
		this.canvas=canvas;
		this.gc=gc;
		
		
		if(type.equals(ObjectProperty.STATIC)) {staticHandler(this);}
		
		this.length=length;
			
		this.color=color;
		this.angleFH=angleFH;
		
		idCounter++;
		this.setId("Line"+idCounter);
	}

	public void creatLine( ){
		gc.setLineWidth(5);
		gc.setStroke(Color.BLACK);
		gc.strokeLine(this.getLocationX(), this.getLocationY(),this.getLocationX() + this.length * Math.cos(Math.toRadians(this.angleFH)), this.getLocationY() - this.length * Math.sin(Math.toRadians(this.angleFH)));
		
	}
	
	
		
		


	public void setLength(double length) {
		
			this.length=length;
			
		
	}
	
	public double getLength() {
		
		return this.length;
	}

	@Override
	public void update() {
		creatLine();
		
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}
	 
	public void setAngle(double angle) {
		this.angleFH=angle;
	}
	private double getAngle() {
		return this.angleFH;
	}

}
