import behavior.impl.FlyRocketPoweredImpl;
import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;

/**
 * Created by SamMyxer on 6/16/16.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPoweredImpl());
        model.performFly();
    }
}
