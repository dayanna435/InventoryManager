package ibero.models;

// Clase base User
public abstract class User {
    protected String name, id, password, email, phone;

    public User(String name, String id, String password, String email, String phone) {
        if (name.isEmpty() || id.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty()) {
            throw new IllegalArgumentException("Ningún campo obligatorio puede estar vacío.");
        }
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    //@formatter:off
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    //@formatter:on
    @Override
    public String toString() { return "Usuario: " + name + " (ID: " + id + ")"; }
}
