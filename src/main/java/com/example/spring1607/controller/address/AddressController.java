package com.example.spring1607.controller.address;

import com.example.spring1607.controller.address.models.AddressResponseModel;
import com.example.spring1607.facade.address.AddressFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AddressController {

    private final AddressFacade addressFacade;

    public AddressController(AddressFacade addressFacade) {
        this.addressFacade = addressFacade;
    }

    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponseModel> getById(@PathVariable Long id){
        AddressResponseModel byId = addressFacade.getById(id);
        return ResponseEntity.ok(byId);
    }

    @GetMapping("addresses")
    public ResponseEntity<ArrayList<AddressResponseModel>> getAll(){
        ArrayList<AddressResponseModel> responseModels = addressFacade.getAll();
        return ResponseEntity.ok(responseModels);
    }
}
