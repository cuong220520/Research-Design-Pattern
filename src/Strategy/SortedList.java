package Strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {

	private SortStrategy sortStrategy;
	private List<String> itemStrings = new ArrayList<>();
	
	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public void add(String name) {
		this.itemStrings.add(name);
	}
	
	public void sort() {
		this.sortStrategy.sort(itemStrings);
	}

}
