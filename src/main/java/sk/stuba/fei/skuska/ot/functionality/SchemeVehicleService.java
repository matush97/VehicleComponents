package sk.stuba.fei.skuska.ot.functionality;

import sk.stuba.fei.skuska.ot.combatvehicle.CombatVehicles;

import java.util.List;
import java.util.Optional;

public interface SchemeVehicleService {
    void addVehicle(CombatVehicles combatVehicles);
    List<CombatVehicles> printVehicles();
    Optional<CombatVehicles> findVehicleById(int id);
}
