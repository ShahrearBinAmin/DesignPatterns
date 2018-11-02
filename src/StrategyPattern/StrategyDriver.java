package StrategyPattern;

public class StrategyDriver {

    public static void main(String[] args) {
        Duck mallerdDuck=new MallerdDuck();
        mallerdDuck.display();
        mallerdDuck.swim();
        mallerdDuck.performFly();
        mallerdDuck.performQuack();

        mallerdDuck.setFlyBehavior(new FlyNoWay());
        mallerdDuck.performFly();
    }
}
