public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
	}

	public void add(int val){
		if(this.head == null){
			Node n = new Node(val);
			this.head = n;
		}else{
			Node c = this.head;
			while(c.next != null){
				c = c.next;
			}
			Node n = new Node(val);
			c.next = n;
		}
	}

	public Node remove(){
		if(this.head == null){
			return null;
		}
			Node c = this.head;
			while (c.next.next != null){
				c = c.next;
			}
			Node temp = c.next;
			c.next = null;
			return temp;
	}

	public void printValues(){
		if(this.head == null){
			System.out.println("List is empty!");
		}
		StringBuilder sb = new StringBuilder();
		sb.append("head --> ");
		Node c = this.head;
		while(c != null ){
			sb.append(c.val);
			sb.append(" --> ");
			c = c.next;
		}
		sb.append("null");
		System.out.println(sb.toString());
	}
}
