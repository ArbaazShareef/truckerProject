package com.arbaaz.truckerproject.controller.controller.entity.service;

import com.arbaaz.truckerproject.controller.controller.entity.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> findAll();

    Vehicle findOne(String id);

    Vehicle create(Vehicle vehicle);

    Vehicle update(String id, Vehicle vehicle);

    void delete(String vin);
    Boolean check(String vin,Vehicle vehicle);
    Iterable<Vehicle> saveAll(List<Vehicle> vehicles);
    public Vehicle findByVin(String vin);
}
