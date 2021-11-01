module com.example.monwedcalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.monwedcalc to javafx.fxml;
    exports com.example.monwedcalc;
}