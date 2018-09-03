package com.arbaaz.truckerproject.controller.controller.entity.service;

import com.arbaaz.truckerproject.controller.controller.entity.entity.Alerts;
import com.arbaaz.truckerproject.controller.controller.entity.entity.Readings;

import java.util.List;

public interface ReadingService {

     List<Readings> findAllByVin(String vin);
    Readings create(Readings readings);
    List<Readings> findAll();

    List<Readings> findGeolocation(String vin);
}
