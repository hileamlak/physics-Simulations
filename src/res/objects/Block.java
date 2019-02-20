package res.objects;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import res.CanvasHandler;
import res.ObjectProperty;
import res.SimulationObjects;

public class Block extends SimulationObjects {
	
	private GraphicsContext gc;
	private Canvas canvas;
	private double width,height;
	Color color; 
	
	public Block(Canvas canvas,GraphicsContext gc,Color color,String type,double width,double height) {
		super(canvas,gc);
		
		this.canvas=canvas;
		this.gc=gc;
		
		
		if(type.equals(ObjectProperty.STATIC)) {staticHandler(this);}
		
		this.width=width;
		this.height=height;	
		this.color=color;
		
		
	}
	
	

	public void creatBlock( ){
		gc.setFill(this.color);
		gc.fillRect(this.getLocationX(),this.getLocationY(), this.width, this.height);
		
		
		
	}

	
	public void Update() {
		clean();
		creatBlock();
		
	}



	public void setDimension(double width, double height) {
		this.width=width;
		this.height=height;	
	}

}
