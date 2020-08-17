package sk.stuba.fei.skuska.ot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.stuba.fei.skuska.ot.combatvehicle.tracked.Artillery;
import sk.stuba.fei.skuska.ot.combatvehicle.tracked.TankDestroyer;
import sk.stuba.fei.skuska.ot.combatvehicle.wheel.LightTank;
import sk.stuba.fei.skuska.ot.combatvehicle.Nationality;
import sk.stuba.fei.skuska.ot.components.cannon.LargeCannon;
import sk.stuba.fei.skuska.ot.components.cannon.MediumCannon;
import sk.stuba.fei.skuska.ot.components.cannon.SmallCannon;
import sk.stuba.fei.skuska.ot.components.chassis.TrackedChassis;
import sk.stuba.fei.skuska.ot.components.chassis.WheelChassis;
import sk.stuba.fei.skuska.ot.components.tower.MediumCannonTower;
import sk.stuba.fei.skuska.ot.functionality.SchemeComponent;
import sk.stuba.fei.skuska.ot.functionality.SchemeVehicle;

@SpringBootApplication
public class OtApplication implements CommandLineRunner {
    private final SchemeVehicle schemeVehicle;
    private final SchemeComponent schemeComponent;

    public OtApplication(SchemeVehicle schemeVehicle, SchemeComponent schemeComponent) {
        this.schemeVehicle = schemeVehicle;
        this.schemeComponent = schemeComponent;
    }

    public static void main(String[] args) {
        SpringApplication.run(OtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //LIGHT_TANK
        WheelChassis wheelChassis = new WheelChassis(11,"wheel",200,50,50,10);
        SmallCannon smallCannon = new SmallCannon(12,"cannon",100,100,100,100);
        LightTank lightTank = new LightTank(1,"tank1", Nationality.USA,200,2000,wheelChassis,smallCannon);

        //Pásový podvozok “ISU-152M”
        TrackedChassis trackedChassis = new TrackedChassis(13,"ISU-152M",100,1000,252,50);
        LargeCannon largeCannon = new LargeCannon(14,"cannon vol.1",100,100,99,50);
        //ARTILLERY
        Artillery artillery = new Artillery(2,"strelec",Nationality.ZSSR,500,trackedChassis,largeCannon);


        schemeVehicle.addVehicle(lightTank);
        schemeVehicle.addVehicle(artillery);
        //component
        schemeComponent.addComponent(wheelChassis);
        schemeComponent.addComponent(smallCannon);
        schemeComponent.addComponent(trackedChassis);
        schemeComponent.addComponent(largeCannon);

        //Delo stredného kalibru “152MM D-4S”
        MediumCannon mediumCannon = new MediumCannon(16,"lava",555,55,67,50);
        MediumCannonTower mediumCannonTower = new MediumCannonTower(15,"152MM D-4S",500,555,mediumCannon);
        schemeComponent.addComponent(mediumCannon);
        schemeComponent.addComponent(mediumCannonTower);
        //Stíhač tankov “ISU-152” s predchádzajúcimi komponentami
        TankDestroyer tankDestroyer = new TankDestroyer(3,"ISU-152",Nationality.GREAT_BRITAIN,80000000,trackedChassis,mediumCannonTower);
        schemeVehicle.addVehicle(tankDestroyer);

    }
}
