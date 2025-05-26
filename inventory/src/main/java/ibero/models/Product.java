package ibero.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private Category category;
    private String model;
    private double price;
    private int stockQuantity;
    private int minStockThreshold;
    private List<String> modificationHistory;

    public Product(Category category, String model, double price, int stockQuantity, int minStockThreshold) {
        if (price <= 0 || stockQuantity < 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero y el stock no puede ser negativo.");
        }

        this.category = category;
        this.model = model;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.minStockThreshold = minStockThreshold;
        this.modificationHistory = new ArrayList<>();
        addModificationHistory("Producto creado con stock inicial: " + stockQuantity);
    }

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price > 0) {
            addModificationHistory("Precio actualizado a $" + price);
            this.price = price;
        }
    }

    public int getStockQuantity() { return stockQuantity; }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            addModificationHistory("Stock actualizado a " + stockQuantity);
            this.stockQuantity = stockQuantity;
        }
    }

    public int getMinStockThreshold() { return minStockThreshold; }

    public void setMinStockThreshold(int minStockThreshold) { this.minStockThreshold = minStockThreshold; }

    private void addModificationHistory(String change) {
        modificationHistory.add(LocalDateTime.now() + " - " + change);
    }

    public boolean isLowStock() { return stockQuantity < minStockThreshold; }

    public List<String> getModificationHistory() { return modificationHistory; }

    public boolean deleteProduct(boolean confirmation) {
        if (confirmation) {
            System.out.println("Producto eliminado: " + model);
            return true;
        }
        System.out.println("Eliminación cancelada.");
        return false;
    }

    @Override
    public String toString() {
        return model + " - $" + price + " (Stock: " + stockQuantity + ") " + (isLowStock() ? "⚠ Bajo inventario!" : "");
    }
}