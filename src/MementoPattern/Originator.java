package MementoPattern;

public class Originator {

    private String state;


    public void setState(String state) {

        System.out.println("Originator : is setting state -- "+state);
        this.state = state;
    }

    public Memento save(){
        System.out.println("Originator : Saving state -- "+state);
        return new Memento(state);
    }

    public void restore(Memento m){
        state=m.getState();
        System.out.println("Originator : State after restoring from memento  -- "+state);
    }
}
