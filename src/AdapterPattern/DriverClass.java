package AdapterPattern;

public class DriverClass {
    public static void main(String[] args) {
        RoundHole roundHole=new RoundHole(5);
        RoundPeg roundPeg=new RoundPeg(4);
        SquarePeg squarePeg=new SquarePeg(6);

        System.out.println(roundHole.fits(new SquarePegAdapter(squarePeg)));
    }
}
