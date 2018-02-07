package ImplementsSelectionModel;

import Program.ProgramController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;

public class TextInSelectionModel {
	ProgramController programController;

	public TextInSelectionModel(ProgramController programController) {
		this.programController = programController;
		textPropertyForTxtInName();
	}

	public void textPropertyForTxtInName() {
		programController.getTxtInWorkerName().textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				if (oldValue.equals(""))
					return;
				System.out.println(observable.getValue());
				if (newValue.equals("")) {
					programController.employes = FXCollections.observableArrayList(programController.employesRoot);
					programController.getTableEmploye().setItems(programController.employes);
					return;
				}
				programController.employes.clear();
				for (int i = 0; i < programController.employesRoot.size(); i++) {
					if (programController.employesRoot.get(i).getNomProperty().getValue().contains(newValue)) {
						programController.employes.add(programController.employesRoot.get(i));
					}
				}
			}
		});
		
		programController.getTxtInWorkerLastName().textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				if (oldValue.equals(""))
					return;
				System.out.println(observable.getValue());
				if (newValue.equals("")) {
					programController.employes = FXCollections.observableArrayList(programController.employesRoot);
					programController.getTableEmploye().setItems(programController.employes);
					return;
				}
				programController.employes.clear();
				for (int i = 0; i < programController.employesRoot.size(); i++) {
					if (programController.employesRoot.get(i).getPrenomProperty().getValue().contains(newValue)) {
						programController.employes.add(programController.employesRoot.get(i));
					}
				}
			}
		});
		
		programController.getTxtInWorkerLastName1().textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				if (oldValue.equals(""))
					return;
				System.out.println(observable.getValue());
				if (newValue.equals("")) {
					programController.employes = FXCollections.observableArrayList(programController.employesRoot);
					programController.getTableEmploye().setItems(programController.employes);
					return;
				}
				programController.employes.clear();
				for (int i = 0; i < programController.employesRoot.size(); i++) {
					if (programController.employesRoot.get(i).getFonctionProperty().getValue().contains(newValue)) {
						programController.employes.add(programController.employesRoot.get(i));
					}
				}
			}
		});
		
	}
}
