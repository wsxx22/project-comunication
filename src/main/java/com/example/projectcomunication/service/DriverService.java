package com.example.projectcomunication.service;

import com.example.projectcomunication.entity.Driver;
import com.example.projectcomunication.exception.DriverNotFound;
import com.example.projectcomunication.repository.DriverRepository;
import com.example.projectcomunication.specification.DriverSpecification;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    private DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

//    public List<DriverDto> findAll () {
//        return driverMapper.toDtoList(driverRepository.findAll());
//    }

    public List<Driver> findAll(DriverSpecification driverSpecification, Pageable pageable) {
        return driverRepository.findAll(driverSpecification, pageable).getContent();
    }

    public Driver addDriver (Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver updateDriver (Driver driver, Long id) {

//        Optional<Driver> driverOptional = driverRepository.findById(id);
        Driver resultDriver = driverRepository.findById(id).orElseThrow(() -> new DriverNotFound());

        resultDriver.setName(driver.getName() == null ? resultDriver.getName() : driver.getName());
        resultDriver.setSurname(driver.getSurname() == null ? resultDriver.getSurname() : driver.getSurname());
        resultDriver.setPesel(driver.getPesel() == null ? resultDriver.getPesel() : driver.getPesel());
            return driverRepository.save(resultDriver);

//        else
//            return driverOptional.orElseThrow(DriverNotFound::new);

//        if (driverOptional.isPresent())
//            return driverRepository.save(driver);
//        else


//        return driverRepository.findById(id).orElseThrow(() -> new DriverNotFound());
    }

}
