package de.hssfds.rentit;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;

public class Controller {

    @FXML
    private TextField txtVermieterVorname;

    @FXML
    private TextField txtVermieterName;

    @FXML
    private void onVermieterAdd() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onVermieterUpdate() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onVermieterDelete() {

    }

    @FXML
    private void onVermieterClear() {
        txtVermieterVorname.setText("hello world: vorname");
        txtVermieterName.setText("hello world: name");
        try {
            //Connection meineConnection = DBConnection.getConnection();
            VermieterDAO vermieterDAO = new VermieterDAO();
            Vermieter vermieter = new Vermieter(1, "Max", "Mustermann");
            vermieterDAO.createVermieter(vermieter);
        }
        catch (Exception ex) {

            ex.printStackTrace();;

        }
    }

    @FXML
    private void onMieterAdd() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onMieterUpdate() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onMieterDelete() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onMieterClear() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onObjektAdd() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onObjektUpdate() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onObjektDelete() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onObjektClear() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onVermietungAdd() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onVermietungUpdate() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onVermietungDelete() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onVermietungClear() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onCheckAvailability() {
        // TODO: Implementierung ergänzen
    }

    @FXML
    private void onShowObjektInfo() {
        // TODO: Implementierung ergänzen
    }
}