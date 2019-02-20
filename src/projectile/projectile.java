package projectile;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class projectile extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = FXMLLoader.load(getClass().getResource("/projectile/projectile.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("projectile.css").toExternalForm());
			
			
			
			primaryStage.setTitle("EthioSciSim:Physics");
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show(); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
