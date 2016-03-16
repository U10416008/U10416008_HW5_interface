

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class BeanMachine extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new MyPolygon(), 400, 400);
    primaryStage.setTitle("ShowPolygon"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

class DisplayBeanMachine extends Pane {
  private void paint() {
    // Create a polygon and place polygon to pane
    Polyline polyline = new Polyline();
	Line[] line = new Line[7];
	Circle[] bean = new Circle[28];
	
    //polygon.setFill(Color.WHITE);
    //polygon.setStroke(Color.BLACK);
    ObservableList<Double> list = polyline.getPoints();
    
    double centerX = getWidth() / 2, centerY = getHeight() / 2;
   

    // Add points to the polygon list
    list.add(centerX-10); 
    list.add(centerY-100);
	list.add(centerX-10); 
    list.add(centerY-80);
	list.add(centerX-80); 
    list.add(centerY+110);
	list.add(centerX-80); 
    list.add(centerY+150);
	list.add(centerX+80); 
    list.add(centerY+150);
	list.add(centerX+80); 
    list.add(centerY+110);
	list.add(centerX+10); 
    list.add(centerY-80);
	list.add(centerX+10); 
    list.add(centerY-100);
	for(int i = 0;i <= 6; i++){
		line[i] = new Line(centerX-60 + i*20,centerY+110,centerX-60 + i*20,centerY+150);
		
	}
    getChildren().clear();
    getChildren().add(polyline); 
	for(int i = 0;i <= 6; i++){
		getChildren().add(line[i]);    
	}
	
  }
  
  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    paint();
  }
  
  @Override
  public void setHeight(double height) {
    super.setHeight(height);
    paint();
  }
}