package observerDAO3.observer;

public class ObserverConcrete<T> implements Observer<T> {

    @Override
    public void update(T value) {    	
        System.out.println(value.getClass()); 
    }
}