
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Displays {

	public static void mainDisplay(Stage p){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
				
		Button b4 = new Button("D4");
		Dice d4 = new Dice(4);
		b4.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Displays.addText(grid, new Integer(d4.roll()).toString(), 0, 1);
			}
		});
		grid.add(b4, 0, 0);
		
		Button b6 = new Button("D6");
		Dice d6 = new Dice(6);
		b6.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Displays.addText(grid, new Integer(d6.roll()).toString(), 1, 1);
			}
		});
		grid.add(b6, 1, 0);
		
		Button b8 = new Button("D8");
		Dice d8 = new Dice(8);
		b8.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Displays.addText(grid, new Integer(d8.roll()).toString(), 2, 1);
			}
		});
		grid.add(b8, 2, 0);
		
		Button b10 = new Button("D10");
		Dice d10 = new Dice(10);
		b10.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Displays.addText(grid, new Integer(d10.roll()).toString(), 3, 1);
			}
		});
		grid.add(b10, 3, 0);
		
		Button b12 = new Button("D12");
		Dice d12 = new Dice(12);
		b12.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Displays.addText(grid, new Integer(d12.roll()).toString(), 4, 1);
			}
		});
		grid.add(b12, 4, 0);
		
		Button b20 = new Button("D20");
		Dice d20 = new Dice(20);
		b20.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Displays.addText(grid, new Integer(d20.roll()).toString(), 5, 1);
			}
		});
		grid.add(b20, 5, 0);
		
		Button reset = new Button("Reset Rolls");
		reset.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				resetDisplay(p);
			}
		});
		grid.add(reset, 6, 0);
		Scene s = new Scene(grid, 500, 500);
		
		p.setScene(s);
	}
	
	public static void resetDisplay(Stage p){
		mainDisplay(p);
	}
	
	public static void addText(GridPane grid, String text, int col, int row){
		Text t = new Text(text);
		grid.add(t, col, row);
	}
	
}
