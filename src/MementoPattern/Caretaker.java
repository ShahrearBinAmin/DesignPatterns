package MementoPattern;

import java.util.ArrayList;
import java.util.Stack;

public class Caretaker {
    //private ArrayList<Memento> mementos=new ArrayList<>();
    private Stack<Memento> mementosUndo =new Stack<>();
    private Stack<Memento> mementosRedo = new Stack<>();

    public void addMemento(Memento memento){
        //mementos.add(memento);
        mementosUndo.add(memento);
    }

//    public Memento getMemento(){
//        return mementos.get(1);
//    }

    public Memento moveBackward(){
        mementosRedo.push(mementosUndo.peek());
        mementosUndo.pop();
        return mementosUndo.peek();
        //return mementosUndo.pop();
    }

    public Memento moveForward(){
        mementosUndo.push(mementosRedo.peek());
        return mementosRedo.pop();
    }
}
