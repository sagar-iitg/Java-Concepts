
class Node {
	int data;
	Node next;

	Node(int d) {
		this.data = d;
		this.next = null;

	}
}

public class Solution {

	Node head = null;

	public static void main(String[] args) {
		Solution list = new Solution();
		list.addFirst(4);
		list.addFirst(588);
		list.addFirst(509);
		list.addFirst(57);
		list.addFirst(55);
		list.addFirst(54);
		list.addFirst(52);
		list.addFirst(15);
		list.addFirst(25);
		list.addLast(10);
		list.printList();
	}

	private void addLast(int i) {
		// TODO Auto-generated method stub
		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;

	}

	private void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	private void addFirst(int i) {
		// TODO Auto-generated method stub
		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}
}
