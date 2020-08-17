package sk.stuba.fei.skuska.ot.functionality;

import org.springframework.stereotype.Service;
import sk.stuba.fei.skuska.ot.components.Component;


import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class SchemeComponent implements SchemeComponentService {
    private List<Component> components= new LinkedList<>();

    //pridanie
    public void addComponent(Component component){
        components.add(component);
    }
    //vyprintovanie
    public List<Component> printComponent(){
        return components;
    }
    //najdenie podla ID
    public Optional<Component> findComponentById(int id){
        return components.stream()
                .filter(component -> component.getId() == id).findFirst();
    }




}

