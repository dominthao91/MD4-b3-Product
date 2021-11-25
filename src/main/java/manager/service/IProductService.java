package manager.service;

import manager.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAll();
    Product findById(int id);
    void  save(Product product);
    void  edit(int id,Product product);
    void delete(int id);
}
