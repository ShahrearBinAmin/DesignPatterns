package DecoratorPattern;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description="Decaf";
    }
    @Override
    public double cost() {
        return 175;
    }
}
