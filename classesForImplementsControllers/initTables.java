package classesForImplementsControllers;

import DataBase.Conge;
import DataBase.DataBaseClass;
import DataBase.Emplyer;
import DataBase.Mission;
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
    private ObservableList<EmployeProperty> employes;
    private ObservableList<Mission> missions;
    private ObservableList<Conge> conges;
    public initTables(){
    	employes = FXCollections.observableArrayList(laBaseDeDonnee.getAllEmployesProperty());
		missions = FXCollections.observableArrayList(laBaseDeDonnee.getAllMissions());
		conges = FXCollections.observableArrayList(laBaseDeDonnee.getAllConges());
    }
    private DataBaseClass laBaseDeDonnee = new DataBaseClass();
    public void initTableemployes(TableView<EmployeProperty> tableEmploye
    		, TableColumn<EmployeProperty, String> columnNomEmploye
    		,TableColumn<EmployeProperty, String> columnPrenomEmploye
    		,TableColumn<EmployeProperty, String> columnFonctionEmploye
    		,TableColumn<EmployeProperty, String> columnDisponibleEmploye){
		tableEmploye.setItems(employes);
		columnNomEmploye.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EmployeProperty,String>, ObservableValue<String>>() {

			@Override
			public ObservableValue<String> call(CellDataFeatures<EmployeProperty, String> param) {
				// TODO Auto-generated method stub
				return param.getValue().getNomProperty();
			}
		});
		columnPrenomEmploye.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EmployeProperty,String>, ObservableValue<String>>() {

			@Override
			public ObservableValue<String> call(CellDataFeatures<EmployeProperty, String> param) {
				// TODO Auto-generated method stub
				return param.getValue().getPrenomProperty();
			}
		});
		columnFonctionEmploye.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EmployeProperty,String>, ObservableValue<String>>() {

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
		columnFonctionEmploye.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<EmployeProperty,String>>() {
			
			@Override
			public void handle(CellEditEvent<EmployeProperty, String> event) {
				event.getRowValue().setFonction(event.getNewValue());
				// TODO Auto-generated method stub
				
			}
		});
		tableEmploye.setItems(employes);
		// TODO Auto-generated method stub
    }
    
    public void addToTable(Emplyer e){
		e.ajouter();
		employes.add(new EmployeProperty(e));
    }
    
}
