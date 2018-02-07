package classesForImplementsControllers;

import java.util.ArrayList;

import DataBase.Conge;
import DataBase.DataBaseClass;
import DataBase.Emplyer;
import DataBase.Mission;
import Program.ProgramController;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;

public class initTables {
	ProgramController programController;
	public initTables(ProgramController programController) {
		this.programController = programController;
	}


	public void initTableemployes(TableView<EmployeProperty> tableEmploye,
			TableColumn<EmployeProperty, String> columnNomEmploye,
			TableColumn<EmployeProperty, String> columnPrenomEmploye,
			TableColumn<EmployeProperty, String> columnFonctionEmploye,
			TableColumn<EmployeProperty, String> columnDisponibleEmploye) {
		tableEmploye.setItems(programController.employes);
		columnDisponibleEmploye.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<EmployeProperty, String>, ObservableValue<String>>() {

					@Override
					public ObservableValue<String> call(CellDataFeatures<EmployeProperty, String> param) {
						// TODO Auto-generated method stub
						return param.getValue().getDisponible().dispoCongOuMiss.getEtat();
					}
				});
		columnNomEmploye.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<EmployeProperty, String>, ObservableValue<String>>() {

					@Override
					public ObservableValue<String> call(CellDataFeatures<EmployeProperty, String> param) {
						// TODO Auto-generated method stub
						return param.getValue().getNomProperty();
					}
				});
		columnPrenomEmploye.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<EmployeProperty, String>, ObservableValue<String>>() {

					@Override
					public ObservableValue<String> call(CellDataFeatures<EmployeProperty, String> param) {
						// TODO Auto-generated method stub
						return param.getValue().getPrenomProperty();
					}
				});
		columnFonctionEmploye.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<EmployeProperty, String>, ObservableValue<String>>() {

					@Override
					public ObservableValue<String> call(CellDataFeatures<EmployeProperty, String> param) {
						// TODO Auto-generated method stub
						return param.getValue().getFonctionProperty();
					}
				});
		tableEmploye.setEditable(true);
		columnNomEmploye.setCellFactory(TextFieldTableCell.<EmployeProperty>forTableColumn());
		columnPrenomEmploye.setCellFactory(TextFieldTableCell.forTableColumn());
		columnFonctionEmploye.setCellFactory(TextFieldTableCell.forTableColumn());
		columnFonctionEmploye.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<EmployeProperty, String>>() {

			@Override
			public void handle(CellEditEvent<EmployeProperty, String> event) {
				event.getRowValue().setFonction(event.getNewValue());
				new Emplyer(event.getRowValue()).modifier();

			}
		});
		columnPrenomEmploye.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<EmployeProperty, String>>() {

			@Override
			public void handle(CellEditEvent<EmployeProperty, String> event) {
				// TODO Auto-generated method stub
				event.getRowValue().setPrenom(event.getNewValue());
				new Emplyer(event.getRowValue()).modifier();
			}
		});
		columnNomEmploye.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<EmployeProperty, String>>() {

			@Override
			public void handle(CellEditEvent<EmployeProperty, String> event) {
				// TODO Auto-generated method stub
				event.getRowValue().setNom(event.getNewValue());
				new Emplyer(event.getRowValue()).modifier();
			}
		});
		tableEmploye.setItems(programController.employes);
	}

	public void addToTable(Emplyer e) {
		e.ajouter();
		programController.employes.add(new EmployeProperty(e));
	}

}
