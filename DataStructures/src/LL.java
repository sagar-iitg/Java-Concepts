
public class LL {

	Node head = null;

	class Node {

		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(String data) {

		Node newNode = new Node(data);

		if (head == null) {
			// System.out.println(head);
			// System.out.println("inside if");
			head = newNode;
			return;
		} else {
			newNode.next = head;
			head = newNode;
			// System.out.println(head.data);
		}

	}

	public void addLast(String data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			return;
		}
		Node temp;
		temp = head;
		while (temp.next != null) {

			temp = temp.next;

		}
		temp.next = newNode;
	}

	public void printList() {

		if (head == null) {
			System.out.println("List is Empty");
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}

	}

	public void deleteFirst() {

		// Node temp = head;
		head = head.next;
	}

	private void deleteLast() {
		// TODO Auto-generated method stub

		Node curr = head;
		// Node prev=head;

		while (curr.next != null) {
			curr = curr.next;
		}
		// curr.next = null;
		Node temp = head;
		while (temp.next != curr) {
			temp = temp.next;
		}
		temp.next = null;

	}

	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("aa");
		list.addFirst("bb");
		list.addFirst("cc");
		list.addLast("dd");
		list.addFirst("ee");
		list.addFirst("xyz");
		list.addFirst("xyddddz");
		list.addFirst("cddc");
		list.addLast("dd");
		list.addFirst("edddd");
		list.addFirst("xyddz");
		list.addFirst("xydddz");
		list.addLast("d122333");
		list.addLast("nnnn");
		list.printList();
		// list.deleteFirst();
		// System.out.println();
		// list.printList();
		list.deleteLast();
		System.out.println();
		list.printList();
	}

}
