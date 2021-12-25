package observerDAO3.observer;
/*
public interface Observable<T, D> {

    void notify(T t, D d);
}*/
public interface Observable<T> {

	   void register(Observer<? super T> observer);

	    void unregister(Observer<? super T> observer);

	    void notify(T arg);
	    
	  
}