
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	static Stage salaryWindow, errorWindow;
	static Parent salaryParent, errorParent;
	static Scene salaryScene, errorScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent parent;
			parent = FXMLLoader.load(getClass().getResource("/programGUI2.fxml"));
			Scene scene = new Scene(parent, 500, 425);
			
			salaryWindow = new Stage();
			salaryParent = FXMLLoader.load(getClass().getResource("/salaryGUI.fxml"));
			salaryScene = new Scene(salaryParent, 100, 25);
			salaryWindow.setTitle("Set Salary");
			salaryWindow.setScene(salaryScene);
			salaryWindow.setResizable(false);
			salaryWindow.initModality(Modality.APPLICATION_MODAL);
			salaryWindow.setOnCloseRequest(e-> e.consume());
			
			
			errorWindow = new Stage();
			errorParent = FXMLLoader.load(getClass().getResource("/errorGUI.fxml"));
			errorScene = new Scene(errorParent, 200, 50);
			errorWindow.setTitle("ERROR");
			errorWindow.setScene(errorScene);
			errorWindow.setResizable(false);
			errorWindow.initModality(Modality.APPLICATION_MODAL);
			

			
			primaryStage.setTitle("$Cal");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void openSalary() {
		salaryWindow.show();
	}
	
	public static void closeSalary() {
		salaryWindow.hide();
	}
	
	public static void openError() {
		errorWindow.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
