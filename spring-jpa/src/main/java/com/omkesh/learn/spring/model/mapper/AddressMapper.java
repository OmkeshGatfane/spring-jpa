package com.omkesh.learn.spring.model.mapper;

import com.omkesh.learn.spring.entity.Address;
import com.omkesh.learn.spring.model.Dao.AddressDao;

/**
 * AddressMapper is responsible for mapping between Address entity and AddressDao.
 */
public class AddressMapper {

    public static Address mappingToEntity(AddressDao addressDao) {
        Address address = new Address();
        address.setStreet(addressDao.getStreet());
        address.setCity(addressDao.getCity());
        address.setCountry(addressDao.getCountry());
        return address;
    }

    public static AddressDao mappingFromEntity(Address address) {
        AddressDao addressDao = new AddressDao();
        addressDao.setStreet(address.getStreet());
        addressDao.setCity(address.getCity());
        addressDao.setCountry(address.getCountry());
        return addressDao;
    }
}
