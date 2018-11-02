package SingletonPattern;

public class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueInstance==null){
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void print(){
        System.out.println("singleton created");
    }
}
