package observerDAO3.observer;
/*
public interface Observer<T, D> {

    
    void update(T t, D d);
}*/
public interface Observer<T> {

    
   // void update(T t);
	public void update(T observable);

}