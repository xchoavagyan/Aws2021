package com.example.spring1607.service.address;

import com.example.spring1607.facade.address.AddressDTO;

import java.util.ArrayList;

public interface AddressService {

    AddressDTO getById(Long id);

    ArrayList<AddressDTO> getAll();

}
