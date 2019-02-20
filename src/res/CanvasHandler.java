package res;



import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasHandler extends AnimTimer{
	
	
	private Canvas canvas;
	private GraphicsContext gc;
	
	static public Color backgroundColor;
	public static int staticObjectCounter;
	public static SimulationObjects staticObjects[]=new SimulationObjects[10];
	
	CanvasHandler(Canvas canvas,GraphicsContext gc){
		this.canvas=canvas;
		this.gc=gc;
	}
	public void clean() {
		gc.setFill(backgroundColor);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
	}
	public void Update() {
		clean();
	}
	public void Draw() {
		
	}
	public void loadImg() {
		
	}
	
}
