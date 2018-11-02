package StrategyPattern;

public class MallerdDuck extends Duck {

    public MallerdDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a mallerd duck");
    }
}
