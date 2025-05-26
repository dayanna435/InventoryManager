package ibero.services;

import ibero.models.Product;
import java.util.ArrayList;
import java.util.List;

public class Store {
        private List<Product> products = new ArrayList<>();

        public Store() { loadProducts(); }

        private void loadProducts() {}

        public List<Product> getProducts() { return products; }
}
