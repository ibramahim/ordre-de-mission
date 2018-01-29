package Program;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

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
    private TableView<?> tableEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnNomEmploye"
    private TableColumn<?, ?> columnNomEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnPrenomEmploye"
    private TableColumn<?, ?> columnPrenomEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnFonctionEmploye"
    private TableColumn<?, ?> columnFonctionEmploye; // Value injected by FXMLLoader

    @FXML // fx:id="columnDisponibleEmploye"
    private TableColumn<?, ?> columnDisponibleEmploye; // Value injected by FXMLLoader

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

   

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		hBoxAffecterA.setDisable(true);
		hBoxcarteEmploye.setDisable(true);
		
	}
	@FXML
    void insertStudentToTheDB(ActionEvent event) {

    }
}
