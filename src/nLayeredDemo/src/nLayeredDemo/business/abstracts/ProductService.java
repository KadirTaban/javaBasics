package nLayeredDemo.src.nLayeredDemo.business.abstracts;

import nLayeredDemo.src.nLayeredDemo.entities.concretes.Product;

import java.util.List;


public interface ProductService {

    void add(Product product);
    List<Product> getAll();
}
