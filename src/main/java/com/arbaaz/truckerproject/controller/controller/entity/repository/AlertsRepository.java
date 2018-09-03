package com.arbaaz.truckerproject.controller.controller.entity.repository;

import com.arbaaz.truckerproject.controller.controller.entity.entity.Alerts;
import com.arbaaz.truckerproject.controller.controller.entity.entity.Readings;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlertsRepository extends CrudRepository<Alerts,String> {

    List<Alerts> findAllByVin(String vin);
}
