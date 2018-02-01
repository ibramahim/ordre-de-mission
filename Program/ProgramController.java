package Program;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import DataBase.Conge;
import DataBase.DataBaseClass;
import DataBase.Emplyer;
import DataBase.Mission;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTableCellBuilder;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class ProgramController implements Initializable{

    @FXML // fx:id="txtInWorkerName"
    private JFXTextField txtInWorkerName; // Value injected by FXMLLoader

    @FXML // fx:id="txtInWorkerLastName"
    private JFXTextField txtInWorkerLastName; // Value injected by FXMLLoader

    @FXML // fx:id="txtInWorkerLastName1"
    private JFXTextField txtInWorkerLastName1; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddWorker"
    private JFXButton btnAddWorker; // Value injected by FXMLLoader

    @FXML // fx:id="tableEmploye"
    private TableView<Emplyer> tableEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnNomEmploye"
    private TableColumn<Emplyer, String> columnNomEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnPrenomEmploye"
    private TableColumn<Emplyer, String> columnPrenomEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnFonctionEmploye"
    private TableColumn<Emplyer, String> columnFonctionEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnDisponibleEmploye"
    private TableColumn<Emplyer, String> columnDisponibleEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="hBoxcarteEmploye"
    private HBox hBoxcarteEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="textNomEmploye"
    private Text textNomEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="textPrenomEmploye"
    private Text textPrenomEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="textFonctionEmploye"
    private Text textFonctionEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="hBoxAffecterA"
    private HBox hBoxAffecterA; // Value injected by FXMLLoader

    @FXML // fx:id="comboBoxCongeOuMission"
    private JFXComboBox<String> comboBoxCongeOuMission; // Value injected by FXMLLoader

    @FXML // fx:id="paneForSituation"
    private Pane paneForSituation; // Value injected by FXMLLoader

   //===================================
    //OBJECTS 
    private ObservableList<Emplyer> employes;
    private ObservableList<Mission> missions;
    private ObservableList<Conge> conges;
    private DataBaseClass laBaseDeDonnee = new DataBaseClass();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		employes = FXCollections.observableArrayList(laBaseDeDonnee.getAllEmployes());
		missions = FXCollections.observableArrayList(laBaseDeDonnee.getAllMissions());
		conges = FXCollections.observableArrayList(laBaseDeDonnee.getAllConges());
		tableEmploye.setItems(employes);
		columnNomEmploye.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Emplyer,String>, ObservableValue<String>>() {

			@Override
			public ObservableValue<String> call(CellDataFeatures<Emplyer, String> param) {
				// TODO Auto-generated method stub
				return new SimpleStringProperty(param.getValue().nom);
			}
		});
		columnPrenomEmploye.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Emplyer,String>, ObservableValue<String>>() {

			@Override
			public ObservableValue<String> call(CellDataFeatures<Emplyer, String> param) {
				// TODO Auto-generated method stub
				return new SimpleStringProperty(param.getValue().prenom);
			}
		});
		columnFonctionEmploye.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Emplyer,String>, ObservableValue<String>>() {

			@Override
			public ObservableValue<String> call(CellDataFeatures<Emplyer, String> param) {
				// TODO Auto-generated method stub
				return new SimpleStringProperty(param.getValue().fonction);
			}
		});
		columnNomEmploye.setCellFactory(new Callback<TableColumn<Emplyer,String>, TableCell<Emplyer,String>>() {

			@SuppressWarnings({ "unchecked", "deprecation" })
			@Override
			public TableCell<Emplyer, String> call(TableColumn<Emplyer, String> param) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		columnPrenomEmploye.setCellFactory(TextFieldTableCell.<Emplyer>forTableColumn());
		columnFonctionEmploye.setCellFactory(TextFieldTableCell.<Emplyer>forTableColumn());
		// TODO Auto-generated method stub
		hBoxAffecterA.setVisible(false);
		hBoxcarteEmploye.setVisible(false);
		
	}
	@FXML void insertEmployeToTheDB(ActionEvent event) {
		Emplyer e = new Emplyer(12, txtInWorkerName.getText(), txtInWorkerLastName.getText(), txtInWorkerLastName1.getText());
		e.ajouter();
		employes.add(e);
    }
}
