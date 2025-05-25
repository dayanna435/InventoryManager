package ibero.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name, id, password, email, phone;
    private List<List<Product>> purchaseHistory;

    public User(String name, String id, String password, String email, String phone) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.purchaseHistory = new ArrayList<>();
    }

    //@formatter:off
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public String getId() { return id;}
    public void setId(String id) { this.id = id;}

    public String getPassword() { return password;}
    public void setPassword(String password) { this.password = password;}

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;}

    public String getPhone() { return phone;}
    public void setPhone(String phone) { this.phone = phone;}
    //@formatter:on
    public List<List<Product>> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addPurchase(List<Product> purchasedItems) {
        purchaseHistory.add(new ArrayList<>(purchasedItems));
    }

    public void showPurchaseHistory() {
        System.out.println("Historial de compras de " + name + ":");
        for (int i = 0; i < purchaseHistory.size(); i++) {
            System.out.println("Compra #" + (i + 1) + ": " + purchaseHistory.get(i));
        }
    }
}
