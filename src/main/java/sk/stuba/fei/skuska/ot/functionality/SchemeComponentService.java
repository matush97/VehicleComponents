package sk.stuba.fei.skuska.ot.functionality;

import sk.stuba.fei.skuska.ot.components.Component;

import java.util.List;
import java.util.Optional;

public interface SchemeComponentService {
    void addComponent(Component component);
    List<Component> printComponent();
    Optional<Component> findComponentById(int id);

}
