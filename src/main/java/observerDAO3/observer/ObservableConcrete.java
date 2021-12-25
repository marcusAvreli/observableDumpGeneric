package observerDAO3.observer;

import java.util.ArrayList;

public class ObservableConcrete<T> implements Observable<T> {

    ArrayList<Observer<? super T>> observerList = new ArrayList<>();

   
	@Override
	public void register(Observer<? super T> observer) {
		// TODO Auto-generated method stub
        observerList.add(observer);

	}

	@Override
	public void unregister(Observer<? super T> observer) {
		// TODO Auto-generated method stub
        observerList.remove(observer);

	}

	@Override
	public void notify(T notification) {
		 for (Observer observer : observerList) {
            observer.update(notification);
        }
		
	}
}
