package sk.stuba.fei.skuska.ot.functionality;

import org.springframework.stereotype.Service;
import sk.stuba.fei.skuska.ot.combatvehicle.CombatVehicles;


import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class SchemeVehicle implements SchemeVehicleService {
    private List<CombatVehicles> vehicles = new LinkedList<>();

    //  pridavanie vozidla
    public void addVehicle(CombatVehicles combatVehicles){
        vehicles.add(combatVehicles);
    }

    //  metoda na vyprintovanie kazdeho vozidla
    public List<CombatVehicles> printVehicles(){
        return vehicles;
    }

    // Metoda na najdenie vozidla podla ID
    public Optional<CombatVehicles> findVehicleById(int id){
        return vehicles.stream()
                .filter(vehicle -> vehicle.getId() == id).findFirst();
    }



}
