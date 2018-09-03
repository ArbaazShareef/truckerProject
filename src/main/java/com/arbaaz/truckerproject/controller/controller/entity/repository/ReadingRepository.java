package com.arbaaz.truckerproject.controller.controller.entity.repository;

import com.arbaaz.truckerproject.controller.controller.entity.entity.Readings;
import com.arbaaz.truckerproject.controller.controller.entity.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReadingRepository extends CrudRepository<Readings,String> {
    List<Readings> findAllByVin(String vin);
}
