package com.arbaaz.truckerproject.controller.controller.entity.repository;

import com.arbaaz.truckerproject.controller.controller.entity.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VehicleRepository extends CrudRepository<Vehicle,String> {
    Optional<Vehicle> findByVin(String vin);
}
