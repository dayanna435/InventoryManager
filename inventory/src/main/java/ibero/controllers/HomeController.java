package ibero.controllers;

import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

import ibero.App;
import ibero.models.User;
import ibero.services.Cart;
import ibero.services.Store;
import ibero.models.Admin;
import ibero.models.Client;
import ibero.models.Product;
import ibero.models.Category;
import ibero.services.Store;
import ibero.services.Cart;

public class HomeController {
    private Store store = new Store();
    private Cart cart = new Cart();
    private User user;
    private Stage stage;

}
