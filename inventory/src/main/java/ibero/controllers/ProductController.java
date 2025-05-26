package ibero.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ibero.models.Product;
import ibero.models.Category;

public class ProductController {
    @FXML
    private TextField modelField;
    @FXML
    private TextField priceField;
    @FXML
    private TextField quantityField;

    @FXML
    private void saveProduct() {
        try {
            String model = modelField.getText();
            double price = Double.parseDouble(priceField.getText());
            int quantity = Integer.parseInt(quantityField.getText());

            Product product = new Product(Category.Other, model, price, quantity, 5);
            System.out.println("Producto guardado: " + product);

            clearFields();
        } catch (NumberFormatException e) {
            System.err.println("Error en el formato de los datos");
        }
    }

    private void clearFields() {
        modelField.clear();
        priceField.clear();
        quantityField.clear();
    }
}