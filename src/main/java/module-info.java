module de.hssfds.rentit {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.hssfds.rentit to javafx.fxml;
    exports de.hssfds.rentit;
}