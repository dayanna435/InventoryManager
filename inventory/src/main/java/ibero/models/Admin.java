package ibero.models;

public class Admin extends User {

    public Admin(String name, String id, String password, String email, String phone) {
        super(name, id, password, email, phone);
    }

    public void deleteProduct(String productId) {
        System.out.println("El producto con ID " + productId + " ha sido eliminado.");
    }

    public void editProduct(String productId, String field, String newValue) {
        System.out.println("El producto con ID " + productId + " ha sido actualizado. Campo: " + field
                + " -> Nuevo Valor: " + newValue);
    }
}
