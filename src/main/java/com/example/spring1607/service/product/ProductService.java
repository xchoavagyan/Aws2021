package com.example.spring1607.service.product;

import com.example.spring1607.facade.product.ProductDTO;
import com.example.spring1607.persistance.entities.Product;

import java.util.ArrayList;

public interface ProductService {

    ProductDTO create(ProductDTO dto);

    ProductDTO getById(Long id);

    ArrayList<ProductDTO> findAll();

    ArrayList<ProductDTO> findAllByName(String name);

    ProductDTO updateById(ProductDTO dto);

    void deleteById(Long id);

}
