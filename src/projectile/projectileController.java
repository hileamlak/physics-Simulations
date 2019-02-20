package projectile;


import java.net.URL;


import java.util.ResourceBundle;

import com.jfoenix.controls.JFXSlider;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import res.CanvasHandler;
import res.ObjectProperty;
import res.objects.Block;


public class projectileController  implements Initializable   {

	//FXML VARIABLES
	@FXML
	private Canvas insaneCanvas;
	@FXML
	private JFXSlider rampLength;
	
	
	
	private GraphicsContext gc;
	
	
	Block leftBlock;
	
	//Local Variables
	double rampHeight=245;
	
	private void initializeStaticBlocks() {
		leftBlock = new Block(insaneCanvas,gc,Color.BLACK,ObjectProperty.DYNAMIC,rampLength.getValue(),insaneCanvas.getHeight());
		leftBlock.setLocation(0, insaneCanvas.getHeight()-rampHeight);
		leftBlock.creatBlock();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		gc=insaneCanvas.getGraphicsContext2D(); 
		//if the tab selected is the projectile make the color black
		CanvasHandler.backgroundColor=Color.WHITE;
		//initalize canvas elements
		
		initializeStaticBlocks();	
		rampLength.setOnDragDetected(new EventHandler<Event>() {
            

			@Override
			public void handle(Event event) {
				System.out.println("Updating Canvas"+rampLength.getValue());
				leftBlock.setDimension(rampLength.getValue(),rampHeight);
				
				leftBlock.Update();
				
			}
        });
		
	}
	
	
	
	
	
	
	
}
