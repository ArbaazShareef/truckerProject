package com.arbaaz.truckerproject.controller.controller.entity.service;

import com.arbaaz.truckerproject.controller.controller.entity.entity.Alerts;
import com.arbaaz.truckerproject.controller.controller.entity.entity.Readings;

import java.util.List;

public interface AlertsService {
    List<Alerts> findAllByVin(String vin);
    Alerts create(Alerts alert);
    List<Alerts> findAll();

    List<Alerts> findRecentAlerts();

    List<Alerts> findHistoricalAlerts(String vin);

}
