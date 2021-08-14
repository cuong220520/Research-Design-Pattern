package Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		SortedList list = new SortedList();
		list.add("Java");
		list.add("PHP");
		list.add("JS");
		list.add("CSS");
		list.add("HTML");
		
		list.setSortStrategy(new QuickSort());
		list.sort();
		
		list.setSortStrategy(new MergeSort());
		list.sort();
	}

}
