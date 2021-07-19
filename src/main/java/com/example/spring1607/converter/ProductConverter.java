package com.example.spring1607.converter;

import com.example.spring1607.annotations.Converter;
import com.example.spring1607.controller.product.models.ProductRequestModel;
import com.example.spring1607.controller.product.models.ProductResponseModel;
import com.example.spring1607.facade.product.ProductDTO;

@Converter
public class ProductConverter {

    public ProductDTO productDataObjFromRequest(ProductRequestModel requestModel) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(requestModel.getProductName());
        return productDTO;
    }

    public ProductResponseModel responseFromDataObj(ProductDTO dto){
        ProductResponseModel responseModel = new ProductResponseModel();
        responseModel.setId(dto.getId());
        responseModel.setProductName(dto.getProductName());
        return responseModel;
    }
}
