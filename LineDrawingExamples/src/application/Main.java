package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.Group;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//creating Single Line
		Line line = new Line();
		line.setStartX(100);
		line.setStartY(0);
		line.setEndX(100);
		line.setEndY(200);
		// Creating Multiple Line
		Line line1 = new Line(40, 50, 180, 50);//Line(startX, startY, endX, endY)
		Line line2 = new Line(40, 100, 180, 100);
		Line line3 = new Line(40,50,40,100);  
        Line line4 = new Line(180,50,180,100);  
		Group root = new Group();
		root.getChildren().addAll(line, line1, line2, line3, line4);
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Line Example");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
