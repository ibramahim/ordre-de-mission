package ImplementsSelectionModel;

import java.io.IOException;

import DataBase.EmployeEtat;
import Program.ProgramController;
import classesForImplementsControllers.EmployeProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TableEmployeSelectionModel {
	ProgramController programController;
	public String nestpasdisponible = "/Program/NestPasDisponible.fxml";
	public String enMission = "/Program/Mission.fxml";
	public String enConge = "/Program/Conge.fxml";

	public TableEmployeSelectionModel(ProgramController p) {
		programController = p;
		selectionModelForTableEmploye();
	}

	public void selectionModelForTableEmploye() {
		programController.getTableEmploye().getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<EmployeProperty>() {

					@Override
					public void changed(ObservableValue<? extends EmployeProperty> observable, EmployeProperty oldValue,
							EmployeProperty newValue) {
						// TODO Auto-generated method stub
						programController.getTextNomEmploye().setText("NOM = " + newValue.getNomProperty().getValue());
						programController.getTextPrenomEmploye()
								.setText("PRENOM = " + newValue.getPrenomProperty().getValue());
						programController.getTextFonctionEmploye()
								.setText("FONCTION = " + newValue.getFonctionProperty().getValue());
						programController.gethBoxcarteEmploye().setVisible(true);
						if (newValue.getDisponible().dispoCongOuMiss == EmployeEtat.DansUneMission
								|| newValue.getDisponible().dispoCongOuMiss == EmployeEtat.DANSUNECONGE) {
							try {
								VBox pane = FXMLLoader.load(getClass().getResource(nestpasdisponible));
								programController.getPaneForSituation().getChildren().setAll(pane);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							
						}
					}
				});
	}
}
