package ibero.services;

import ibero.models.Product;
import ibero.models.Category;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public Store() { loadProducts(); }

    private void loadProducts() {
        products.add(
                createProduct(Category.Accesories, "Auriculares Sony", 150, 10, "/resources/images/accesories.jpg"));
        products.add(createProduct(Category.Amplification, "Micrófono Shure", 250, 7,
                "/resources/images/amplification.jpg"));
        products.add(
                createProduct(Category.Acoustic_Basses, "Auriculares Sony", 150, 10, "/resources/images/acoustic.jpg"));
        products.add(
                createProduct(Category.Electric_Basses, "Micrófono Shure", 250, 7, "/resources/images/electric.jpg"));
    }

    private Product createProduct(Category category, String model, double price, int stockQuantity, String imagePath) {
        String fullPath = getClass().getResource(imagePath) != null ? getClass().getResource(imagePath).toString() : "";
        return new Product(category, model, price, stockQuantity, 0, fullPath);
    }

    public List<Product> getProducts() { return products; }
}
