package ibero.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import ibero.App;

public class AdminController {

    @FXML
    private void switchToPrimary() throws IOException { App.setRoot("primary"); }
}