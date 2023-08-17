package codegym.vn.repository;

import codegym.vn.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Laptop", "15000000", "Mới", "Asus"));
        productMap.put(2, new Product(2, "Iphone", "80000000", "Mới", "Apple"));
        productMap.put(3, new Product(3, "Ipad", "10000000", "Cũ", "SamSung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> findByName(String nameProduct) {
        List<Product> list = new ArrayList<>();
        for (Product product : productMap.values()) {
            if (product.getNameProduct().equals(nameProduct)) {
                list.add(product);
            }
        }
        return list;
    }
}
