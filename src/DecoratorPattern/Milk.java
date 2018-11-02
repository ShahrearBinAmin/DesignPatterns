package DecoratorPattern;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Milk";
    }

    @Override
    public double cost() {
        return 17+beverage.cost();
    }
}
