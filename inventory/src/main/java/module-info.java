module ibero {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens ibero to javafx.fxml;
    opens ibero.controllers to javafx.fxml;

    exports ibero;
}
