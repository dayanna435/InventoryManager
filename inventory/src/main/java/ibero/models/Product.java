package ibero.models;

import javafx.scene.image.Image;

public class Product {
    private Category category;
    private String model, imgPath;
    private Image img;
    private double price;
    private int stockQuantity, cartQuantity;

    public Product(Category category, String model, String imgPath, double price, int stockQuantity, int cartQuantity) {
        this.category = category;
        this.model = model;
        this.imgPath = imgPath;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.cartQuantity = cartQuantity;
        this.img = new Image(imgPath);
    }

    public Product(Category category2, String model2, double price2, int stockQuantity2, String fullPath) {

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getImgPath() { return imgPath; }

    public void setImgPath(String imgPath) { this.imgPath = imgPath; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getStockQuantity() { return stockQuantity; }

    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }

    public Image getImg() { return img; }

    public void setImg(Image img) { this.img = img; }

    public int getCartQuantity() { return cartQuantity; }

    public void setCartQuantity(int cartQuantity) {
        if (cartQuantity >= 0 && cartQuantity <= stockQuantity) {
            this.cartQuantity = cartQuantity;
        }
    }

    public void reduceStock() {
        if (cartQuantity > 0) {
            stockQuantity -= cartQuantity;
            cartQuantity = 0;
        }
    }

    @Override
    public String toString() { return model + " - $" + price + " (Stock: " + stockQuantity + ")"; }
}
