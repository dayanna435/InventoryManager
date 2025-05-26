package ibero.models;

public class Client extends User {

    public Client(String name, String id, String password, String email, String phone) {
        super(name, id, password, email, phone);
    }

    public void searchProduct(String productName) { System.out.println("Buscando producto: " + productName); }

    public void checkStockAlerts() { System.out.println("Consultando productos con bajo inventario..."); }
}