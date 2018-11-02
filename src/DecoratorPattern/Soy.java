package DecoratorPattern;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Soy";
    }

    @Override
    public double cost() {
        return 13+beverage.cost();
    }
}
