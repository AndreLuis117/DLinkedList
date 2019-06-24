import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		DLinkedList<String> list = new DLinkedList<String>();
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		list.addLast("y");

		list.add(4,"X");


		System.out.println(Arrays.toString(list.toArray()));


		System.out.println("first: "+list.getFirst());
		System.out.println("last: "+list.getLast());
		System.out.println("4: "+list.get(4));

		System.out.println(Arrays.toString(list.toArray()));
		list.addLast("x");

		System.out.println(Arrays.toString(list.toArray()));
		list.addFirst("A");

		System.out.println(Arrays.toString(list.toArray()));
		list.removeFirst();

		System.out.println(Arrays.toString(list.toArray()));
		list.removeLast();

		System.out.println(Arrays.toString(list.toArray()));
		list.remove(2);

		System.out.println(Arrays.toString(list.toArray()));
		list.removeLast();//aqui

		System.out.println(Arrays.toString(list.toArray()));
		list.removeFirst();

		System.out.println(Arrays.toString(list.toArray()));
		list.addLast("x");

		System.out.println(Arrays.toString(list.toArray()));
		list.addFirst("A");



		System.out.println(Arrays.toString(list.toArray()));


	}
	
	

}
