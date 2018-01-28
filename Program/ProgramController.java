package Program;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProgramController implements Initializable {

	@FXML
	private TableView<?> tableWorkerConserner;

	@FXML
	private TableColumn<?, ?> columnEtudListe;

	@FXML
	private TableView<?> tablePrinc;

	@FXML
	private TableColumn<?, ?> columnName;

	@FXML
	private TableColumn<?, ?> columnDeb;

	@FXML
	private TableColumn<?, ?> columnFin;

	@FXML
	private JFXCheckBox ceckBoxPdf;

	@FXML
	private JFXButton btnPrintOrdre;

	@FXML
	private JFXComboBox<String> comboBoxRestant;

	@FXML
	private JFXButton btnAjoutEmploye;

	@FXML
	private JFXButton btnSuppWorker;

	@FXML
	private JFXTextField txtInWorkerName;

	@FXML
	private JFXTextField txtInWorkerLastName;

	@FXML
	private JFXDatePicker datePickDebut;

	@FXML
	private JFXDatePicker datePickFin;

	@FXML
	private JFXButton btnAddWorker;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		comboBoxRestant.getItems().addAll("0 jour","un jour" , "3 jour" , "une semaine");
		comboBoxRestant.setValue("0 jour");
	}

	@FXML
	void SuppWorkerFromDB(ActionEvent event) {

	}

	@FXML
	void ajouterEmployeAuListe(ActionEvent event) {

	}

	@FXML
	void imprimerLesOrdresDeMissions(ActionEvent event) {

	}

	@FXML
	void insertStudentToTheDB(ActionEvent event) {

	}

}
