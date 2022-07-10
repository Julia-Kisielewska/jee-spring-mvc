package pl.coderslab.controller;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProduktDao {

    public List<Product> getList(){
        List<Product> list = new ArrayList<>();
        list.add(new Product("Chair", 150.0, 1L));
        list.add(new Product("Sofa", 1345.0, 2L));
        list.add(new Product("Lamp", 230.0, 3L));

        return list;
    }
}
