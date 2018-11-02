package DecoratorPattern;

public class Decaf extends Beverage{

    public Decaf(){
        description="Decaf";
    }
    @Override
    public double cost() {
        return 200;
    }
}
