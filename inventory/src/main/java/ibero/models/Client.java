package ibero.models;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    private List<List<Product>> purchaseHistory;

    public Client(String name, String id, String password, String email, String phone,
            List<List<Product>> purchaseHistory) {
        super(name, id, password, email, phone);
        this.purchaseHistory = new ArrayList<>();
    }

    public void addPurchase(List<Product> purchasedItems) { purchaseHistory.add(new ArrayList<>(purchasedItems)); }

    public void showPurchaseHistory() {
        System.out.println("Historial de compras de " + name + ":");
        for (int i = 0; i < purchaseHistory.size(); i++) {
            System.out.println("Compra #" + (i + 1) + ": " + purchaseHistory.get(i));
        }
    }
}
