package MementoPattern;

public class MementoDriver {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("state1");
        originator.setState("state2");
        caretaker.addMemento(originator.save());
        originator.setState("state3");
        caretaker.addMemento(originator.save());
        originator.setState("state4");
        caretaker.addMemento(originator.save());
        originator.setState("state5");
        caretaker.addMemento(originator.save());
        originator.restore(caretaker.moveBackward());
        originator.restore(caretaker.moveBackward());
        originator.restore(caretaker.moveForward());
        originator.restore(caretaker.moveForward());
    }
}
