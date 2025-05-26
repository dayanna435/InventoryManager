package ibero.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLController {

    @FXML
    private ComboBox<String> categoryFilter;

    @FXML
    private Label copyrightLabel;

    @FXML
    private ScrollPane contentPane;

    @FXML
    private VBox sidebar;

    @FXML
    public void initialize() { categoryFilter.getItems().addAll("Electrónicos", "Ropa", "Hogar", "Juguetes"); }

    @FXML
    private void sortByName() { System.out.println("Ordenando productos alfabéticamente..."); }

    @FXML
    private void sortByPrice() { System.out.println("Ordenando productos por precio..."); }

    @FXML
    private void clearFilters() {
        categoryFilter.getSelectionModel().clearSelection();
        System.out.println("Filtros limpiados.");
    }

    @FXML
    private void registerProduct() { System.out.println("Registrando nuevo producto..."); }

    @FXML
    private void deleteProduct() { System.out.println("Eliminando producto..."); }

    @FXML
    private void editProduct() { System.out.println("Editando producto..."); }

    @FXML
    private void generateInventoryReport() { System.out.println("Generando reporte de inventario..."); }

    public void setStage(Stage stage) { throw new UnsupportedOperationException("Unimplemented method 'setStage'"); }
}
