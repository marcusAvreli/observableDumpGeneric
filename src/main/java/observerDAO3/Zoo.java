package observerDAO3;

import java.util.ArrayList;
import java.util.List;

import observerDAO3.observer.ObservableConcrete;
import observerDAO3.observer.ObserverConcrete;
import observerDAO3.Animal;

public class Zoo {
	private List<Animal> animals = new ArrayList<>();

	ObservableConcrete<Animal> observable = new ObservableConcrete();
	ObserverConcrete<Zoo> observer = new ObserverConcrete();
	public void addAnimal(Animal animal) {
		// Add the animal to the list of animals
		this.animals.add(animal);
		observable.register(new ObserverConcrete<Animal>());

		int value = 5;
		observable.notify(animal);
		// Notify the list of registered listeners
		// this.notifyAnimalAddedListeners(animal);
	}

}
