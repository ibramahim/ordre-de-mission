package Program;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import DataBase.Conge;
import DataBase.DataBaseClass;
import DataBase.Emplyer;
import DataBase.Mission;
import ImplementsSelectionModel.TableEmployeSelectionModel;
import ImplementsSelectionModel.TextInSelectionModel;
import classesForImplementsControllers.CongeProperty;
import classesForImplementsControllers.EmployeProperty;
import classesForImplementsControllers.MissionProperty;
import classesForImplementsControllers.initTables;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTableCellBuilder;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class ProgramController implements Initializable {

	@FXML // fx:id="txtInWorkerName"
	private JFXTextField txtInWorkerName; // Value injected by FXMLLoader

	@FXML // fx:id="txtInWorkerLastName"
	private JFXTextField txtInWorkerLastName; // Value injected by FXMLLoader

	@FXML // fx:id="txtInWorkerLastName1"
	private JFXTextField txtInWorkerLastName1; // Value injected by FXMLLoader

	@FXML // fx:id="btnAddWorker"
	private JFXButton btnAddWorker; // Value injected by FXMLLoader

	@FXML // fx:id="tableEmploye"
	private TableView<EmployeProperty> tableEmploye; // Value injected by
														// FXMLLoader

	@FXML // fx:id="columnNomEmploye"
	private TableColumn<EmployeProperty, String> columnNomEmploye; // Value
																	// injected
																	// by
																	// FXMLLoader

	@FXML // fx:id="columnPrenomEmploye"
	private TableColumn<EmployeProperty, String> columnPrenomEmploye; // Value
																		// injected
																		// by
																		// FXMLLoader

	@FXML // fx:id="columnFonctionEmploye"
	private TableColumn<EmployeProperty, String> columnFonctionEmploye; // Value
																		// injected
																		// by
																		// FXMLLoader

	@FXML // fx:id="columnDisponibleEmploye"
	private TableColumn<EmployeProperty, String> columnDisponibleEmploye; // Value
																			// injected
																			// by
																			// FXMLLoader

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
	private JFXComboBox<String> comboBoxCongeOuMission; // Value injected by
														// FXMLLoader

	@FXML // fx:id="paneForSituation"
	private Pane paneForSituation; // Value injected by FXMLLoader

	// ===================================
	// OBJECTS
	initTables employesInit;
	// lists
	public ObservableList<EmployeProperty> employes;
	public ObservableList<MissionProperty> missions;
	public ObservableList<CongeProperty> conges;
	public ArrayList<EmployeProperty> employesRoot;
	// la base de donnee
	public static DataBaseClass laBaseDeDonnee = new DataBaseClass();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		employesRoot = laBaseDeDonnee.getAllEmployesProperty();
		employes = FXCollections.observableArrayList(employesRoot);
		missions = FXCollections.observableArrayList(laBaseDeDonnee.getAllMissionsProperties(employesRoot));
		conges = FXCollections.observableArrayList(laBaseDeDonnee.getAllCongesProperties(employesRoot));

		hBoxAffecterA.setVisible(false);
		hBoxcarteEmploye.setVisible(false);
		employesInit = new initTables(this);
		employesInit.initTableemployes(tableEmploye, columnNomEmploye, columnPrenomEmploye, columnFonctionEmploye,
				columnDisponibleEmploye);
		TextInSelectionModel txtSelection = new TextInSelectionModel(this);
		TableEmployeSelectionModel tableEmployeSelection = new TableEmployeSelectionModel(this);

	}

	@FXML
	void insertEmployeToTheDB(ActionEvent event) {
		if (txtInWorkerName.getText().equals("") || txtInWorkerLastName.getText().equals("")) {
			event.consume();
			return;
		}

		Emplyer e = new Emplyer(12, txtInWorkerName.getText(), txtInWorkerLastName.getText(),
				txtInWorkerLastName1.getText());
		employesInit.addToTable(e);
		txtInWorkerName.setText("");
		txtInWorkerLastName.setText("");
		txtInWorkerLastName1.setText("");
	}

	public JFXTextField getTxtInWorkerName() {
		return txtInWorkerName;
	}

	public JFXTextField getTxtInWorkerLastName() {
		return txtInWorkerLastName;
	}

	public JFXTextField getTxtInWorkerLastName1() {
		return txtInWorkerLastName1;
	}

	public JFXButton getBtnAddWorker() {
		return btnAddWorker;
	}

	public TableView<EmployeProperty> getTableEmploye() {
		return tableEmploye;
	}

	public TableColumn<EmployeProperty, String> getColumnNomEmploye() {
		return columnNomEmploye;
	}

	public TableColumn<EmployeProperty, String> getColumnPrenomEmploye() {
		return columnPrenomEmploye;
	}

	public TableColumn<EmployeProperty, String> getColumnFonctionEmploye() {
		return columnFonctionEmploye;
	}

	public TableColumn<EmployeProperty, String> getColumnDisponibleEmploye() {
		return columnDisponibleEmploye;
	}

	public HBox gethBoxcarteEmploye() {
		return hBoxcarteEmploye;
	}

	public Text getTextNomEmploye() {
		return textNomEmploye;
	}

	public Text getTextPrenomEmploye() {
		return textPrenomEmploye;
	}

	public Text getTextFonctionEmploye() {
		return textFonctionEmploye;
	}

	public HBox gethBoxAffecterA() {
		return hBoxAffecterA;
	}

	public JFXComboBox<String> getComboBoxCongeOuMission() {
		return comboBoxCongeOuMission;
	}

	public Pane getPaneForSituation() {
		return paneForSituation;
	}

	public initTables getEmployesInit() {
		return employesInit;
	}

}
