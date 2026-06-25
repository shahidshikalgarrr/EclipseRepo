package day3;

public class TestDataStructures<L> extends LinkedList<L> {

	public static void main(String[] args) {
		
		TestDataStructures<Integer> list = new TestDataStructures<Integer>();
		list.add(80);
		list.add(25);
		list.add(40);


		list.remove(1);
		list.print();

	}

}
