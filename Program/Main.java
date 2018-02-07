package Program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
/*
 * FXMLLoader loader = new FXMLLoader(getClass().getResource("my.fxml"));
Parent root = loader.load();
MyController c = loader.getController();

stage.setScene(new Scene(root, 500, 500));
 * @see javafx.application.Application#start(javafx.stage.Stage)
 */
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Program.fxml"));
			Parent root = loader.load();
			ProgramController programController = loader.getController();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("gestionnaire les ordres des missions");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
