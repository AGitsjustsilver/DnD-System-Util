
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Displays.mainDisplay(primaryStage);
		
		primaryStage.setTitle("Dice and Stuff");
		primaryStage.show();
	}
	
}
