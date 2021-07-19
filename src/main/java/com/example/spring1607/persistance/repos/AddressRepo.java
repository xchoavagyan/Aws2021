package com.example.spring1607.persistance.repos;

import com.example.spring1607.persistance.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
