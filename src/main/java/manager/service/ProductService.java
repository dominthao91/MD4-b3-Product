package manager.service;

import manager.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Quan", 100, "new", "nsx"));
        products.put(2, new Product(2, "ao", 200, "new", "nsx"));
        products.put(3, new Product(3, "giay", 300, "new", "nsx"));
        products.put(4, new Product(4, "dep", 200, "new", "nsx"));
        products.put(5, new Product(5, "tat", 111, "new", "nsx"));
    }

    @Override
    public List<Product> showAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void edit(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
