module de.hssfds.rentit {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens de.hssfds.rentit to javafx.fxml;
    exports de.hssfds.rentit;
}