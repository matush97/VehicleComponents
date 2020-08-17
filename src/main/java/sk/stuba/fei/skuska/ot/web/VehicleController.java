package sk.stuba.fei.skuska.ot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sk.stuba.fei.skuska.ot.combatvehicle.CombatVehicles;
import sk.stuba.fei.skuska.ot.combatvehicle.tracked.Artillery;
import sk.stuba.fei.skuska.ot.functionality.SchemeVehicleService;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
    private final SchemeVehicleService schemeVehicleService;

    @Autowired
    public VehicleController(SchemeVehicleService schemeVehicleService) {
        this.schemeVehicleService = schemeVehicleService;
    }

    //vytvorenie zoznamu všetkých existujúcich vozidiel/
    @GetMapping("/")
    public String findAll(Model model){
        model.addAttribute("schemeVehicle",schemeVehicleService.printVehicles());
        //model.addAttribute("typeProperties1", Nationality.values());
        return "vehicle/allVehicles";
    }
    //vrátenie konkrétneho vozidla podľa jeho ID
    @GetMapping("/id/{id}")
    public String detailsUserById(@PathVariable int id, Model model){
        Optional<CombatVehicles> userById = schemeVehicleService.findVehicleById(id);
        if(userById.isPresent()){
            CombatVehicles combatVehicles = userById.get();
            model.addAttribute("user",combatVehicles);
        }
        return "vehicle/one";
    }




}
