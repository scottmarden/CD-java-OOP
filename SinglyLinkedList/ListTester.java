public class ListTester {
	public static void main(String[] args){
		Node n = new Node(2);
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.add(2);
		sll.add(4);
		sll.add(5);
		sll.add(10);
		sll.add(-2);

		sll.printValues();

	}
}
