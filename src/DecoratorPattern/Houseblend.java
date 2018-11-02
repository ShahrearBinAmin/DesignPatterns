package DecoratorPattern;

public class Houseblend extends Beverage{

    public Houseblend(){
        description="Decaf";
    }
    @Override
    public double cost() {
        return 190;
    }
}
