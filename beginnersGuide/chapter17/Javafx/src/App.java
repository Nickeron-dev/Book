import java.javafx.application.*;
import java.javafx.scene.*;
import java.javafx.stage.*;
import java.javafx.scene.layout.*;

public class App extends Application {
	public static void main(String[] args) {
		System.out.println("This is my first JavaFX app");
		
		// lauching file with args
		launch(args);
	}
	
	public void init() {
		System.out.println("Now in init()");
	}

	public void start(Stage myStage) {
		System.out.println("In start() method");

		myStage.setTitle("My first JavaFX app");

		FlowPane rootNode = new FlowPane();

		// creating a scene
		Scene myScene = new Scene(rootNode, 300, 200);

		//setting scene on stage
		myStage.setScene(myScene);

		myStage.show();
	}

	public void stop() {
		System.out.println("Now in stop() method");
	}
}

