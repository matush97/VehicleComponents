package sk.stuba.fei.skuska.ot.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sk.stuba.fei.skuska.ot.combatvehicle.CombatVehicles;
import sk.stuba.fei.skuska.ot.components.Component;
import sk.stuba.fei.skuska.ot.functionality.SchemeComponent;
import sk.stuba.fei.skuska.ot.functionality.SchemeComponentService;


import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/component")
public class ComponentController {
    private final SchemeComponentService schemeComponentService;

    @Autowired
    public ComponentController(SchemeComponentService schemeComponentService) {
        this.schemeComponentService = schemeComponentService;
    }
    //vytvorenie zoznamu všetkých existujúcich vozidiel/komponentov
    @GetMapping("/")
    public String findAllComponent(Model model){
        model.addAttribute("schemeComponent", schemeComponentService.printComponent());
        return "component/allComponent";
    }
    //vrátenie konkrétneho vozidla/komponentu podľa jeho ID
    @GetMapping("/id/{id}")
    public String detailsComponentById(@PathVariable int id, Model model){
        Optional<Component> component = schemeComponentService.findComponentById(id);
        if(component.isPresent()){
            Component component1 = component.get();
            model.addAttribute("component",component1);
        }
        return "component/oneComponent";
    }


}
