package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "new address added successfully!!";
    }

    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).get();
    }

    public String updateAddress(Address address, Long id) {
        addressRepo.existsById(id);
        addressRepo.save(address);
        return "Address updated for : " + id + " successfully!!";

    }

    public String deleteAddress(Address address, Long id) {
        addressRepo.deleteById(id);
        return "Address for "+ id +" deleted successfull!!";
    }
}
