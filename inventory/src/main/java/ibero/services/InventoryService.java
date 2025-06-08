package ibero.services;

import ibero.models.Product;
import ibero.models.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryService {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> filterByCategory(Category category) {
        return products.stream()
                .filter(p -> p.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
