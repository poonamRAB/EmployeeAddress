package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //add new address
    @PostMapping("/address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    //get all addresses
    @GetMapping("/address")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    //get address by id
    @GetMapping("/address/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    //update address by Id
    @PutMapping("/address/{id}")
    public String updateAddress(@RequestBody Address address,@PathVariable Long id ){
        return addressService.updateAddress(address,id);
    }

    //delete address by id from list
    @DeleteMapping("/address/{id}")
    public String deleteAddress(@RequestBody Address address,@PathVariable Long id){
        return addressService.deleteAddress(address,id);
    }
}
